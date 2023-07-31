package seleniumsessions;

public class CustomCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//    tagname[attribute='value']
		
		
		//more than one attribute
		//    tagname[attribute1='value'][attribute2='value2']
		//     input[id='username'][type='email'][data-test-id='email-input-field']
		//     [id] -- css(it gives how many ids are there)
		//    //*[@id] --xpath (it gives how many ids are there)
		
		
		//NO Text concept in css
		
		
		//contains in CSS
		//    tagname[attribute*='value']
		
		
		
		//starts with in css:
		
		//   tagname[attribute^='value'] -- css
		
		// starts -with  xpath 
		// //tagname[starts-with(@attribute,'value')]-- xpath
		
		// Ends with in css:
		//   tagname[attribute$='value']
		
		//no Ends -with in xpath(deprecated)
		
		// parent to child concept in css
		
		//    form>div --direct child
		//    form div --(direct+indirect) 
		
		//child to parent is not possible with css(LIMITATION)/Back word traversing-NA
		//child to ancestor--NA
		//preceding-sibling--NA
		
		//following -sibling--Yes in css
		//   tagname[attribute='value']+tagname(immediate following sibling)
		//   tagname[attribute='value']~tagname (all the following sibling)
		
		// indexing in css
		//   tagname#id tagname:first-child
		//   tagname#id tagname:first-child
		//   tagname#id tagname:nth-child
		//    tagname#id tagname:nth-last-child(2)  --(gives last second child)
		
		// to traversing with odd /even values
		//  tagname#id tagname:nth-child(odd)
		//  tagname#id tagname:nth-child(even)
		
		//   tagname#id tagname:nth-child(n+4)
		//   tagname#id tagname:nth-child(4n)  --(it travere to multiples of 4)
		
		
		// not in css:
		
		
	}
	
	

}
