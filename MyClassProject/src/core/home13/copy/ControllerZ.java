package core.home13.copy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ControllerZ {

	private List<Animal> animals = restore();
	
	public void restore(String fileName){
		File file = new File(fileName+".txt");
		if(file.exists()){
			try(BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(file)))){
				List<Animal> list = new ArrayList<>();
				while (br.ready()) {
					String line = br.readLine();
					if(!line.isEmpty()){
						String[] array = line.split("\\ ");
						Animal an = new Animal(array[0], AnimalType.valueOf(array[1]));
						list.add(an);
					}
				}
				animals = list;
				save();
			}catch (IOException e) {
			}
		}
	}
	
	public void write(String fileName){
		File file = new File(fileName+".txt");
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter(file)))){
			for (Animal animal : animals) {
				pw.println(animal.getAnimalName()+" "
						+animal.getType());
			}
			pw.flush();
		}catch (IOException e) {
		}
	}
	
	private void save(){
		File file = new File("save.bf");
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			oos.writeObject(animals);
			oos.flush();
		}catch (IOException e) {
		}
	}
	
	@SuppressWarnings("unchecked")
	private List<Animal> restore(){
		File file = new File("save.bf");
		if(file.exists()){
			try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
				return (List<Animal>) ois.readObject();
			}catch (IOException | ClassNotFoundException e) {
			}
		}
		return new ArrayList<>();
	}
	
	public void add(Animal an){
		animals.add(an);
		save();
	}
	
	public void print(){
		animals.forEach(System.out::println);
	}
}