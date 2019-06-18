package com.biz.inout.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.intout.model.InOutDto;
import com.biz.intout.model.InOutVO;

public class InOutService_02 {

	List<InOutDto> iolist;

	FileReader fileReader;
	BufferedReader buffer;

	public InOutService_02(String fileName) throws FileNotFoundException {

		iolist = new ArrayList<InOutDto>();
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
	}

	public void readFile() throws IOException {

		String reader = "";
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			String[] ioLists = reader.split(":");
			InOutDto vo = new InOutDto();
			vo.setIo_date(ioLists[0]);
			vo.setPname(ioLists[1]);
			vo.setIntout(ioLists[2]);
			vo.setPrice(Integer.valueOf(ioLists[3]));
			vo.setAmt(Integer.valueOf(ioLists[4]));
			iolist.add(vo);

		}
	}

	public void clacIoList() {
		// vo를 반복하면서
		// 매입, 매출계산하고
		// dto에 담아주고
		for (InOutDto vo : iolist) {

			if (vo.getIntout().equals("1")) {
				vo.setIntout("매입");
				int in_total = vo.getAmt() * vo.getPrice();
				vo.setIn_total(in_total);
			} else {
				vo.setIntout("매출");
				int out_total = vo.getAmt() * vo.getPrice();
				vo.setOut_total(out_total);
			}
			iolist.add(vo);
		}

	}

	public void listView() {

		System.out.println("매입매출 리스트");
		System.out.println("====================================================================");
		System.out.println("일자\t구분\t상품명\t단가\t수량\t매입금액\t매출금액");
		System.out.println("--------------------------------------------------------------------");
		for (InOutDto dto : iolist) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\n", dto.getIo_date(), dto.getIntout(), dto.getPname(),
					dto.getPrice(), dto.getAmt(), dto.getIn_total(), dto.getOut_total());
		}

	}

}
