/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Meter Multiplier Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterMultiplierKind()
 * @model
 * @generated
 */
public enum MeterMultiplierKind implements Enumerator {
    /**
     * The '<em><b>KH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KH_VALUE
     * @generated
     * @ordered
     */
    KH( 0, "kH", "kH" ),

    /**
     * The '<em><b>KR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KR_VALUE
     * @generated
     * @ordered
     */
    KR( 1, "kR", "kR" ),

    /**
     * The '<em><b>KE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KE_VALUE
     * @generated
     * @ordered
     */
    KE( 2, "kE", "kE" ),

    /**
     * The '<em><b>Ct Ratio</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CT_RATIO_VALUE
     * @generated
     * @ordered
     */
    CT_RATIO( 3, "ctRatio", "ctRatio" ),

    /**
     * The '<em><b>Pt Ratio</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PT_RATIO_VALUE
     * @generated
     * @ordered
     */
    PT_RATIO( 4, "ptRatio", "ptRatio" ),

    /**
     * The '<em><b>Transformer Ratio</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_RATIO_VALUE
     * @generated
     * @ordered
     */
    TRANSFORMER_RATIO( 5, "transformerRatio", "transformerRatio" );

    /**
     * The '<em><b>KH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>KH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KH
     * @model name="kH"
     * @generated
     * @ordered
     */
    public static final int KH_VALUE = 0;

    /**
     * The '<em><b>KR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>KR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KR
     * @model name="kR"
     * @generated
     * @ordered
     */
    public static final int KR_VALUE = 1;

    /**
     * The '<em><b>KE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>KE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KE
     * @model name="kE"
     * @generated
     * @ordered
     */
    public static final int KE_VALUE = 2;

    /**
     * The '<em><b>Ct Ratio</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ct Ratio</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CT_RATIO
     * @model name="ctRatio"
     * @generated
     * @ordered
     */
    public static final int CT_RATIO_VALUE = 3;

    /**
     * The '<em><b>Pt Ratio</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pt Ratio</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PT_RATIO
     * @model name="ptRatio"
     * @generated
     * @ordered
     */
    public static final int PT_RATIO_VALUE = 4;

    /**
     * The '<em><b>Transformer Ratio</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transformer Ratio</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_RATIO
     * @model name="transformerRatio"
     * @generated
     * @ordered
     */
    public static final int TRANSFORMER_RATIO_VALUE = 5;

    /**
     * An array of all the '<em><b>Meter Multiplier Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MeterMultiplierKind[] VALUES_ARRAY = new MeterMultiplierKind[] { KH, KR, KE, CT_RATIO,
            PT_RATIO, TRANSFORMER_RATIO, };

    /**
     * A public read-only list of all the '<em><b>Meter Multiplier Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< MeterMultiplierKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Meter Multiplier Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeterMultiplierKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MeterMultiplierKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Meter Multiplier Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeterMultiplierKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MeterMultiplierKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Meter Multiplier Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeterMultiplierKind get( int value ) {
        switch( value ) {
        case KH_VALUE:
            return KH;
        case KR_VALUE:
            return KR;
        case KE_VALUE:
            return KE;
        case CT_RATIO_VALUE:
            return CT_RATIO;
        case PT_RATIO_VALUE:
            return PT_RATIO;
        case TRANSFORMER_RATIO_VALUE:
            return TRANSFORMER_RATIO;
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
    private MeterMultiplierKind( int value, String name, String literal ) {
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

} //MeterMultiplierKind
