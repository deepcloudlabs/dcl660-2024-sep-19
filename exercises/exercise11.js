db.movies.aggregate([
	{
		$unwind: {
			"path": "$directors"
		}	
	}	
]);