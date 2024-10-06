package java_interview;

import java.util.Stack;

public class SimplifiedCanonicalPath {
	
	/*
	 * 
	 * Example 1:

Input: path = "/home/"

Output: "/home"

Explanation:

The trailing slash should be removed.

Example 2:

Input: path = "/home//foo/"

Output: "/home/foo"

Explanation:

Multiple consecutive slashes are replaced by a single one.

Example 3:

Input: path = "/home/user/Documents/../Pictures"

Output: "/home/user/Pictures"

Explanation:

A double period ".." refers to the directory up a level (the parent directory).

Example 4:

Input: path = "/../"

Output: "/"

Explanation:

Going one level up from the root directory is not possible.

Example 5:

Input: path = "/.../a/../b/c/../d/./"

Output: "/.../b/d"

Explanation:

"..." is a valid name for a directory in this problem.

 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/.../a/../b/c/../d/./";
		SimplifiedCanonicalPath canonicalPath = new SimplifiedCanonicalPath();
		String val = canonicalPath.simplifyPath(path);
		
		System.out.println(val);
	}

	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>(); // create a stack to keep track of directories
		String[] directories = path.split("/"); // split the path by slash '/'
		for (String dir : directories) { // iterate over the directories
			if (dir.equals(".") || dir.isEmpty()) { // ignore the current directory '.' and empty directories
				continue;
			} else if (dir.equals("..")) { // go one level up for double period '..'
				if (!stack.isEmpty()) { // if stack is not empty, pop the top element
					stack.pop();
				}
			} else { // for any other directory, push it to the stack
				stack.push(dir);
			}
		}
		return "/" + String.join("/", stack); // join the directories in the stack with slash '/' and add a slash at the
												// beginning
	}

}
