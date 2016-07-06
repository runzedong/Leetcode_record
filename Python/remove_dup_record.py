def main():
	res = []
	dir = {}
	num = int(input())
	for i in range (0, num):
		person = input()
		name, ssn = [s for s in person.split(":")]
		if ssn in dir:
			dir[ssn] = compare(dir[ssn], name)
		else:
			dir[ssn] = name
			res.append(ssn)
	for ssn in res:
		print (dir[ssn]+":"+ssn)

def compare(pre_name, name):
	pre_name_list = pre_name.split(" ")
	name_list = name.split(" ")
	if len(name_list) == 1:
		return pre_name
	elif len(name_list) > len(pre_name_list):
		return name
	elif len(pre_name_list) > len(name_list):
		return pre_name
	elif len(name_list) == 2:
		if ',' in name_list[0]:
			return pre_name
		else:
			return name
	elif len(name_list) == 3:
		name_list = name.split(".")
		pre_name_list = pre_name.split(".")
		if len(name_list) < len(pre_name_list):
			return name
		elif len(name_list) > len(pre_name_list):
			return pre_name
		if ',' in name:
			return pre_name
		else:
			return name
		
main()
