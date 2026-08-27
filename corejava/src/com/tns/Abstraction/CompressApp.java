package com.tns.Abstraction;
 abstract class FileCompress{
	 abstract void compress(String File);
	 void Showdetails() {
		 System.out.println("Compressing File Started...");
	 }
 }
class Zipfilecompressor extends FileCompress{

	@Override
	void compress(String File) {
		// TODO Auto-generated method stub
		System.out.println("Compress using Zip");
		int originalsize=100;
	}
	
}



public class CompressApp {

}
