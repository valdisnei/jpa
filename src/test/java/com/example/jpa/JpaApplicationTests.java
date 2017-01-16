package com.example.jpa;

import com.example.jpa.model.AcessoCaptadorOnline;
import com.example.jpa.repository.JpaExampleRepository;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Transactional
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfigTest.class)
public class JpaApplicationTests {

	@Autowired
	private JpaExampleRepository jpaRepository;

	@Autowired
	private ObjectMapper mapper;

	List<AcessoCaptadorOnline> acessoCaptadorOnlines = Lists.newArrayList();

	@Before
	public void setUp() throws Exception {

		CsvSchema schema = CsvSchema.builder()
			.addColumn("acessoCaptadorOnlineID")
			.addColumn("data")
			.addColumn("identificacaoServico")
			.addColumn("identificacaoCliente")
			.addColumn("habilitacaoCaptadorOnlineID")
			.addColumn("statusProcessamentoAcessoCaptadorOnlineID")
			.build();

		MappingIterator<Map.Entry> it = mapper
				.reader(AcessoCaptadorOnline.class)
				.with(schema)
				.readValues(new File(getClass().getResource("/").getPath() + "acessoOnline.csv"));

		while (it.hasNextValue()){
			AcessoCaptadorOnline online= (AcessoCaptadorOnline) it.nextValue();
			acessoCaptadorOnlines.add(online);
		}
	}


	@Test
	public void readCsv() throws Exception {
		acessoCaptadorOnlines.forEach(s->jpaRepository.save(s));
	}


	@Test
	public void contextLoads() {
		acessoCaptadorOnlines.forEach(s->jpaRepository.save(s));

		jpaRepository.findAll().forEach(s-> System.out.println("s = " + s) );

	}

}
