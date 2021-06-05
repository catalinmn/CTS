package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categories.TesteGetPromovabilitate;
import ro.ase.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class, TestGrupaWithMocks.class })
@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
