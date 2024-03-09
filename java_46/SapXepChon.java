package java_46;

public class SapXepChon implements SapXepInterface{

	@Override
	public void sapxepTang(double[] arr) {
		 int n = arr.length;
		 int i, j, min_idx;
		 for (i = 0; i < n - 1; i++) {
			 min_idx = i;
			 for (j = i + 1; j < n; j++)
				 if (arr[j] < arr[min_idx])
					 min_idx = j;
			 double temp = arr[min_idx];
			 arr[min_idx] = arr[i];
			 arr[i] = temp;
		 }
	}

	@Override
	public void sapxepGiam(double[] arr) {
		int n = arr.length;
		 int i, j, max_idx;
		 for (i = 0; i < n - 1; i++) {
			 max_idx = i;
			 for (j = i + 1; j < n; j++)
				 if (arr[j] > arr[max_idx])
					 max_idx = j;
			 double temp = arr[max_idx];
			 arr[max_idx] = arr[i];
			 arr[i] = temp;
		 }
	}

}
