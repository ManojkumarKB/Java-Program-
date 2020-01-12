package crud_mongo;

import java.net.UnknownHostException;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class crud_mongo {
	
	private static MongoClient mongoy;
	private static DB db;
	private static DBCollection collection;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeDatabase("localhost",27017);
		switchDB("test1");
		switchCollection("pract1");
		showContentInDocument();
		InsertTest();
		showContentInDocument();
		UpdateTest();
		ReadTest();
		//RemoveTest();
		showContentInDocument();
		//DeleteAll();
		showContentInDocument();
	}

	private static void DeleteAll() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Delete all....");
		DBCursor cursor=collection.find();
		while(cursor.hasNext()){
			collection.remove(cursor.next());
		}
	}

	private static void RemoveTest() {
		// TODO Auto-generated method stub
		BasicDBObject doc=new BasicDBObject();
		doc.put("username","manoj");
		Remove(doc);
	}

	private static void ReadTest() {
		// TODO Auto-generated method stub
		BasicDBObject document =new BasicDBObject();
		document.put("username", "manoj");
		Read(document);
	}

	private static void UpdateTest() {
		// TODO Auto-generated method stub
		BasicDBObject document=new BasicDBObject();
		document.put("$set",new BasicDBObject().append("password", "newpassword"));
		Update(document,"username","Manoj");
	}

	private static void InsertTest() {
		// TODO Auto-generated method stub
		BasicDBObject document=new BasicDBObject();
		document.put("username", "password");
		document.put("password", "Manoj1998");
		Insert(document);
	}

	private static void switchCollection(String string) {
		// TODO Auto-generated method stub
		if(db!=null)
		{
			System.out.println("Switching collection");
			collection=db.getCollection(string);
		}
	}

	private static void showContentInDocument() 
	{
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("show content of current db");
		DBCursor cursor=collection.find();
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
	}

	private static void switchDB(String string)
	{
		// TODO Auto-generated method stub
			System.out.println("Switching  DB.....");
			db=mongoy.getDB(string);
	}

	private static void InitializeDatabase(String host, int port) 
	{
		System.out.println("Initialize database");
		mongoy=new MongoClient(host,port);
		System.out.println("Db initialized");
	}
	private static void Insert(BasicDBObject document)
	{
		System.out.println("Inserting the document.....");
		if(document!=null)
		{
			collection.insert(document);
		}
	}
	private static void Update(BasicDBObject document,String usrname,String pwd)
	{
		System.out.println("Updating the document....");
		if(document!=null)
		{
			BasicDBObject searchQ=new BasicDBObject().append(usrname, pwd);
			collection.update(searchQ, document);
		}
	}
	private static void Read(BasicDBObject document)
	{
		System.out.print("");
		System.out.println("Read User...");
		if(document!=null)
		{
			DBCursor cursor=collection.find(document);
			while(cursor.hasNext())
			{
				System.out.println(cursor.next());
			}
		}
	}
	private static void Remove(BasicDBObject remove)
	{
		System.out.println("");
		System.out.println("Remove username");
		if(remove!=null)
		{
			collection.remove(remove);
		}
	}

}
