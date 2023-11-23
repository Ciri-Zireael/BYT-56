# BYT-56
Implementation of tasks 5-6 for BYT

## Chain of Responsibility 
- Used for processing letters (if there are any missing pieces, they get filled with default values)  
Implementation:  
Client -> LetterProcessor  
Handler -> LetterHandler  
ConcreteHandlers:  
-> BaseLetterHandler  
-> LetterToyHandler  
-> LetterCandyHandler  
-> LetterPackagingHandler  

## Builder 
- Used for assembling christmas presents  
Implementation:  
Director -> Santa  
Builder -> ChristmasPresentBuilder  
ConcreteBuilders:  
-> GoodPresentBuilder  
-> BadPresentBuilder  
Product -> ChristmasPresent  

## Mediator 
- Used for communication between children and Santa (passing on letters and presents)  
Implementation:  
Mediator -> AbstractElf  
ConcreteMediator -> Elf  
Colleague -> InterestedParty  
ConcreteColleagues:  
-> Santa  
-> Child  
