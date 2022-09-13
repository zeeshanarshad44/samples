public class Images
	{
		public int ID { get; set; }
    	//	A short description.
		public string description { get; set; }
    	//	When to start displaying this image.
		public DateTime start { get; set; }
    	//	When to stop displaying this image.
		public DateTime finish { get; set; }
    	//	Link to source.
		public string link { get; set; }
    	//	Which screen to display it on.
		public int screen_no { get; set; }
    	//	Is it a video or an image?
		public bool is_video { get; set; }
	}
