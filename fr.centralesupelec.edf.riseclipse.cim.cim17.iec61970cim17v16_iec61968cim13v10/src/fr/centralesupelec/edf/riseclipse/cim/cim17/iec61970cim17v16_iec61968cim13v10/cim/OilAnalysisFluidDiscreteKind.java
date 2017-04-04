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
 * A representation of the literals of the enumeration '<em><b>Oil Analysis Fluid Discrete Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilAnalysisFluidDiscreteKind()
 * @model
 * @generated
 */
public enum OilAnalysisFluidDiscreteKind implements Enumerator {
    /**
     * The '<em><b>Color Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLOR_NUMBER_VALUE
     * @generated
     * @ordered
     */
    COLOR_NUMBER( 0, "colorNumber", "colorNumber" ),

    /**
     * The '<em><b>Color Number Platinum Cobalt Scale</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLOR_NUMBER_PLATINUM_COBALT_SCALE_VALUE
     * @generated
     * @ordered
     */
    COLOR_NUMBER_PLATINUM_COBALT_SCALE( 1, "colorNumberPlatinumCobaltScale", "colorNumberPlatinumCobaltScale" ),

    /**
     * The '<em><b>Corrosive Sulphur By D1275</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CORROSIVE_SULPHUR_BY_D1275_VALUE
     * @generated
     * @ordered
     */
    CORROSIVE_SULPHUR_BY_D1275( 2, "corrosiveSulphurByD1275", "corrosiveSulphurByD1275" ),

    /**
     * The '<em><b>Corrosive Sulphur By62535</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CORROSIVE_SULPHUR_BY62535_VALUE
     * @generated
     * @ordered
     */
    CORROSIVE_SULPHUR_BY62535( 3, "corrosiveSulphurBy62535", "corrosiveSulphurBy62535" ),

    /**
     * The '<em><b>Corrosive Sulphur By51353</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CORROSIVE_SULPHUR_BY51353_VALUE
     * @generated
     * @ordered
     */
    CORROSIVE_SULPHUR_BY51353( 4, "corrosiveSulphurBy51353", "corrosiveSulphurBy51353" ),

    /**
     * The '<em><b>Tarnish Level</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TARNISH_LEVEL_VALUE
     * @generated
     * @ordered
     */
    TARNISH_LEVEL( 5, "tarnishLevel", "tarnishLevel" ),

    /**
     * The '<em><b>Sludge Precipitation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLUDGE_PRECIPITATION_VALUE
     * @generated
     * @ordered
     */
    SLUDGE_PRECIPITATION( 6, "sludgePrecipitation", "sludgePrecipitation" );

    /**
     * The '<em><b>Color Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Color Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLOR_NUMBER
     * @model name="colorNumber"
     * @generated
     * @ordered
     */
    public static final int COLOR_NUMBER_VALUE = 0;

    /**
     * The '<em><b>Color Number Platinum Cobalt Scale</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Color Number Platinum Cobalt Scale</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLOR_NUMBER_PLATINUM_COBALT_SCALE
     * @model name="colorNumberPlatinumCobaltScale"
     * @generated
     * @ordered
     */
    public static final int COLOR_NUMBER_PLATINUM_COBALT_SCALE_VALUE = 1;

    /**
     * The '<em><b>Corrosive Sulphur By D1275</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Corrosive Sulphur By D1275</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CORROSIVE_SULPHUR_BY_D1275
     * @model name="corrosiveSulphurByD1275"
     * @generated
     * @ordered
     */
    public static final int CORROSIVE_SULPHUR_BY_D1275_VALUE = 2;

    /**
     * The '<em><b>Corrosive Sulphur By62535</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Corrosive Sulphur By62535</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CORROSIVE_SULPHUR_BY62535
     * @model name="corrosiveSulphurBy62535"
     * @generated
     * @ordered
     */
    public static final int CORROSIVE_SULPHUR_BY62535_VALUE = 3;

    /**
     * The '<em><b>Corrosive Sulphur By51353</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Corrosive Sulphur By51353</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CORROSIVE_SULPHUR_BY51353
     * @model name="corrosiveSulphurBy51353"
     * @generated
     * @ordered
     */
    public static final int CORROSIVE_SULPHUR_BY51353_VALUE = 4;

    /**
     * The '<em><b>Tarnish Level</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tarnish Level</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TARNISH_LEVEL
     * @model name="tarnishLevel"
     * @generated
     * @ordered
     */
    public static final int TARNISH_LEVEL_VALUE = 5;

    /**
     * The '<em><b>Sludge Precipitation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sludge Precipitation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SLUDGE_PRECIPITATION
     * @model name="sludgePrecipitation"
     * @generated
     * @ordered
     */
    public static final int SLUDGE_PRECIPITATION_VALUE = 6;

    /**
     * An array of all the '<em><b>Oil Analysis Fluid Discrete Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OilAnalysisFluidDiscreteKind[] VALUES_ARRAY = new OilAnalysisFluidDiscreteKind[] {
            COLOR_NUMBER, COLOR_NUMBER_PLATINUM_COBALT_SCALE, CORROSIVE_SULPHUR_BY_D1275, CORROSIVE_SULPHUR_BY62535,
            CORROSIVE_SULPHUR_BY51353, TARNISH_LEVEL, SLUDGE_PRECIPITATION, };

    /**
     * A public read-only list of all the '<em><b>Oil Analysis Fluid Discrete Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OilAnalysisFluidDiscreteKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Oil Analysis Fluid Discrete Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisFluidDiscreteKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisFluidDiscreteKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Fluid Discrete Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisFluidDiscreteKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisFluidDiscreteKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Fluid Discrete Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisFluidDiscreteKind get( int value ) {
        switch( value ) {
        case COLOR_NUMBER_VALUE:
            return COLOR_NUMBER;
        case COLOR_NUMBER_PLATINUM_COBALT_SCALE_VALUE:
            return COLOR_NUMBER_PLATINUM_COBALT_SCALE;
        case CORROSIVE_SULPHUR_BY_D1275_VALUE:
            return CORROSIVE_SULPHUR_BY_D1275;
        case CORROSIVE_SULPHUR_BY62535_VALUE:
            return CORROSIVE_SULPHUR_BY62535;
        case CORROSIVE_SULPHUR_BY51353_VALUE:
            return CORROSIVE_SULPHUR_BY51353;
        case TARNISH_LEVEL_VALUE:
            return TARNISH_LEVEL;
        case SLUDGE_PRECIPITATION_VALUE:
            return SLUDGE_PRECIPITATION;
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
    private OilAnalysisFluidDiscreteKind( int value, String name, String literal ) {
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

} //OilAnalysisFluidDiscreteKind
