package org.toxsoft.l2.lib.devices;

import static org.toxsoft.l2.lib.l10n.IL2LibSharedResources.*;

import org.toxsoft.core.tslib.bricks.keeper.*;
import org.toxsoft.core.tslib.bricks.keeper.std.*;
import org.toxsoft.core.tslib.bricks.strid.*;
import org.toxsoft.core.tslib.bricks.strid.coll.*;
import org.toxsoft.core.tslib.bricks.strid.coll.impl.*;
import org.toxsoft.core.tslib.utils.errors.*;

/**
 * /** Kind of I/O pin.
 *
 * @author hazard157
 */
@SuppressWarnings( "javadoc" )
public enum EPinKind
    implements IStridable {

  AI( "AI", STR_PINKIND_AI, STR_PINKIND_AI_D ), //$NON-NLS-1$

  AO( "AO", STR_PINKIND_AO, STR_PINKIND_AO_D ), //$NON-NLS-1$

  DI( "DI", STR_PINKIND_DI, STR_PINKIND_DI_D ), //$NON-NLS-1$

  DO( "DO", STR_PINKIND_DO, STR_PINKIND_DO_D ); //$NON-NLS-1$

  /**
   * The registered keeper ID.
   */
  public static final String KEEPER_ID = "EPinKind"; //$NON-NLS-1$

  /**
   * The keeper singleton.
   */
  public static final IEntityKeeper<EPinKind> KEEPER = new StridableEnumKeeper<>( EPinKind.class );

  private static IStridablesListEdit<EPinKind> list = null;

  private final String id;
  private final String name;
  private final String description;

  EPinKind( String aId, String aName, String aDescription ) {
    id = aId;
    name = aName;
    description = aDescription;
  }

  // --------------------------------------------------------------------------
  // IStridable
  //

  @Override
  public String id() {
    return id;
  }

  @Override
  public String nmName() {
    return name;
  }

  @Override
  public String description() {
    return description;
  }

  // ----------------------------------------------------------------------------------
  // Stridable enum common API
  //

  /**
   * Returns all constants in single list.
   *
   * @return {@link IStridablesList}&lt; {@link EPinKind} &gt; - list of constants in order of declaraion
   */
  public static IStridablesList<EPinKind> asList() {
    if( list == null ) {
      list = new StridablesList<>( values() );
    }
    return list;
  }

  /**
   * Returns the constant by the ID.
   *
   * @param aId String - the ID
   * @return {@link EPinKind} - found constant
   * @throws TsNullArgumentRtException any argument = <code>null</code>
   * @throws TsItemNotFoundRtException no constant found by specified ID
   */
  public static EPinKind getById( String aId ) {
    return asList().getByKey( aId );
  }

  /**
   * Finds the constant by the name.
   *
   * @param aName String - the name
   * @return {@link EPinKind} - found constant or <code>null</code>
   * @throws TsNullArgumentRtException any argument = <code>null</code>
   */
  public static EPinKind findByName( String aName ) {
    TsNullArgumentRtException.checkNull( aName );
    for( EPinKind item : values() ) {
      if( item.name.equals( aName ) ) {
        return item;
      }
    }
    return null;
  }

  /**
   * Returns the constant by the name.
   *
   * @param aName String - the name
   * @return {@link EPinKind} - found constant
   * @throws TsNullArgumentRtException any argument = <code>null</code>
   * @throws TsItemNotFoundRtException no constant found by specified name
   */
  public static EPinKind getByName( String aName ) {
    return TsItemNotFoundRtException.checkNull( findByName( aName ) );
  }

}
