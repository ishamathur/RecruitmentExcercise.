package ufo.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ufo.dto.UfoSighting;

public class UfoSightingServiceImpl implements UfoSightingService {

	public static final String TsvFile = "C://RecruitmentExcercise//RecruitmentExcercise-master//src//main//resources//ufo_awesome.tsv";
	public List<String> getAllSightings() {
		// TODO Auto-generated method stub
		List<String> ufolist = new ArrayList();
		try  {
			Scanner scanner = new Scanner(new File(TsvFile));
			while (scanner.hasNext()){
				String line = scanner.nextLine();
				ufolist.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ufolist;
	}

	public List<String> search(int yearSeen, int monthSeen) {
		List<String> ufolist = new ArrayList();
		try  {
			Scanner scanner = new Scanner(new File(TsvFile));
			while (scanner.hasNext()){
				String line = scanner.nextLine();
				if (line.startsWith(Integer.toString(yearSeen)+ Integer.toString(monthSeen)))
				 {
					ufolist.add(line);
				 }
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ufolist;
	}

}
