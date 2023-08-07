package woongs2;

class Dictionary extends PairMap {
	private int set;

	public Dictionary(int num) {
		KeyArray = new String[num];
		valueArray = new String[num];
		this.set = 0;
	}

	public String get(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null; // ���ϴ� key�� ���ٸ� null ����
	}

	public void put(String key, String value) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				KeyArray[i] = key;
				valueArray[i] = value;
				return; // �ߺ��� key�� �ִٸ� �����ϰ� �Լ� ����
			}
		}
		KeyArray[set] = key;
		valueArray[set] = value;
		set++;
	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				return s; // ������ value �� ����
			}
		}
		return null; // ������ ���� ���ٸ� null ����
	}

	public int length() {
		return set;
	}
}