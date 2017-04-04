/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Asset Hazard Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetHazardKind()
 * @model
 * @generated
 */
public enum AssetHazardKind implements Enumerator {
    /**
     * The '<em><b>Ambient Temp Below Minus12</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AMBIENT_TEMP_BELOW_MINUS12_VALUE
     * @generated
     * @ordered
     */
    AMBIENT_TEMP_BELOW_MINUS12( 0, "ambientTempBelowMinus12", "ambientTempBelowMinus12" ),

    /**
     * The '<em><b>Ambient Temp Above38</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AMBIENT_TEMP_ABOVE38_VALUE
     * @generated
     * @ordered
     */
    AMBIENT_TEMP_ABOVE38( 1, "ambientTempAbove38", "ambientTempAbove38" ),

    /**
     * The '<em><b>Vegetation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VEGETATION_VALUE
     * @generated
     * @ordered
     */
    VEGETATION( 2, "vegetation", "vegetation" ),

    /**
     * The '<em><b>Children At Play</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHILDREN_AT_PLAY_VALUE
     * @generated
     * @ordered
     */
    CHILDREN_AT_PLAY( 3, "childrenAtPlay", "childrenAtPlay" ),

    /**
     * The '<em><b>Fishing Area</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FISHING_AREA_VALUE
     * @generated
     * @ordered
     */
    FISHING_AREA( 4, "fishingArea", "fishingArea" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 5, "other", "other" );

    /**
     * The '<em><b>Ambient Temp Below Minus12</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ambient Temp Below Minus12</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AMBIENT_TEMP_BELOW_MINUS12
     * @model name="ambientTempBelowMinus12"
     * @generated
     * @ordered
     */
    public static final int AMBIENT_TEMP_BELOW_MINUS12_VALUE = 0;

    /**
     * The '<em><b>Ambient Temp Above38</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ambient Temp Above38</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AMBIENT_TEMP_ABOVE38
     * @model name="ambientTempAbove38"
     * @generated
     * @ordered
     */
    public static final int AMBIENT_TEMP_ABOVE38_VALUE = 1;

    /**
     * The '<em><b>Vegetation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Vegetation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VEGETATION
     * @model name="vegetation"
     * @generated
     * @ordered
     */
    public static final int VEGETATION_VALUE = 2;

    /**
     * The '<em><b>Children At Play</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Children At Play</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHILDREN_AT_PLAY
     * @model name="childrenAtPlay"
     * @generated
     * @ordered
     */
    public static final int CHILDREN_AT_PLAY_VALUE = 3;

    /**
     * The '<em><b>Fishing Area</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fishing Area</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FISHING_AREA
     * @model name="fishingArea"
     * @generated
     * @ordered
     */
    public static final int FISHING_AREA_VALUE = 4;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 5;

    /**
     * An array of all the '<em><b>Asset Hazard Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AssetHazardKind[] VALUES_ARRAY = new AssetHazardKind[] { AMBIENT_TEMP_BELOW_MINUS12,
            AMBIENT_TEMP_ABOVE38, VEGETATION, CHILDREN_AT_PLAY, FISHING_AREA, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Asset Hazard Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AssetHazardKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Asset Hazard Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetHazardKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetHazardKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Hazard Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetHazardKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetHazardKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Hazard Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetHazardKind get( int value ) {
        switch( value ) {
        case AMBIENT_TEMP_BELOW_MINUS12_VALUE:
            return AMBIENT_TEMP_BELOW_MINUS12;
        case AMBIENT_TEMP_ABOVE38_VALUE:
            return AMBIENT_TEMP_ABOVE38;
        case VEGETATION_VALUE:
            return VEGETATION;
        case CHILDREN_AT_PLAY_VALUE:
            return CHILDREN_AT_PLAY;
        case FISHING_AREA_VALUE:
            return FISHING_AREA;
        case OTHER_VALUE:
            return OTHER;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private AssetHazardKind( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //AssetHazardKind
