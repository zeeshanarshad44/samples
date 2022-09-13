public class User
{
	public int ID { get; set; }
	public string username { get; set; }
	//	Non-hashed passwords are being used here.
	public string password { get; set; }
}
