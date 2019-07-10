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
 * A representation of the literals of the enumeration '<em><b>Wind Lookup Table Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindLookupTableFunctionKind()
 * @model
 * @generated
 */
public enum WindLookupTableFunctionKind implements Enumerator {
    /**
     * The '<em><b>Prr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRR_VALUE
     * @generated
     * @ordered
     */
    PRR( 0, "prr", "prr" ),

    /**
     * The '<em><b>Omegap</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OMEGAP_VALUE
     * @generated
     * @ordered
     */
    OMEGAP( 1, "omegap", "omegap" ),

    /**
     * The '<em><b>Ipmax</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IPMAX_VALUE
     * @generated
     * @ordered
     */
    IPMAX( 2, "ipmax", "ipmax" ),

    /**
     * The '<em><b>Iqmax</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IQMAX_VALUE
     * @generated
     * @ordered
     */
    IQMAX( 3, "iqmax", "iqmax" ),

    /**
     * The '<em><b>Pwp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PWP_VALUE
     * @generated
     * @ordered
     */
    PWP( 4, "pwp", "pwp" ),

    /**
     * The '<em><b>Tcwdu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TCWDU_VALUE
     * @generated
     * @ordered
     */
    TCWDU( 5, "tcwdu", "tcwdu" ),

    /**
     * The '<em><b>Tduwt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TDUWT_VALUE
     * @generated
     * @ordered
     */
    TDUWT( 6, "tduwt", "tduwt" ),

    /**
     * The '<em><b>Qmaxp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QMAXP_VALUE
     * @generated
     * @ordered
     */
    QMAXP( 7, "qmaxp", "qmaxp" ),

    /**
     * The '<em><b>Qminp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QMINP_VALUE
     * @generated
     * @ordered
     */
    QMINP( 8, "qminp", "qminp" ),

    /**
     * The '<em><b>Qmaxu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QMAXU_VALUE
     * @generated
     * @ordered
     */
    QMAXU( 9, "qmaxu", "qmaxu" ),

    /**
     * The '<em><b>Qminu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QMINU_VALUE
     * @generated
     * @ordered
     */
    QMINU( 10, "qminu", "qminu" ),

    /**
     * The '<em><b>Tuover</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TUOVER_VALUE
     * @generated
     * @ordered
     */
    TUOVER( 11, "tuover", "tuover" ),

    /**
     * The '<em><b>Tuunder</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TUUNDER_VALUE
     * @generated
     * @ordered
     */
    TUUNDER( 12, "tuunder", "tuunder" ),

    /**
     * The '<em><b>Tfover</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TFOVER_VALUE
     * @generated
     * @ordered
     */
    TFOVER( 13, "tfover", "tfover" ),

    /**
     * The '<em><b>Tfunder</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TFUNDER_VALUE
     * @generated
     * @ordered
     */
    TFUNDER( 14, "tfunder", "tfunder" ),

    /**
     * The '<em><b>Qwp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QWP_VALUE
     * @generated
     * @ordered
     */
    QWP( 15, "qwp", "qwp" );

    /**
     * The '<em><b>Prr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Prr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRR
     * @model name="prr"
     * @generated
     * @ordered
     */
    public static final int PRR_VALUE = 0;

    /**
     * The '<em><b>Omegap</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Omegap</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OMEGAP
     * @model name="omegap"
     * @generated
     * @ordered
     */
    public static final int OMEGAP_VALUE = 1;

    /**
     * The '<em><b>Ipmax</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ipmax</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IPMAX
     * @model name="ipmax"
     * @generated
     * @ordered
     */
    public static final int IPMAX_VALUE = 2;

    /**
     * The '<em><b>Iqmax</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Iqmax</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IQMAX
     * @model name="iqmax"
     * @generated
     * @ordered
     */
    public static final int IQMAX_VALUE = 3;

    /**
     * The '<em><b>Pwp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pwp</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PWP
     * @model name="pwp"
     * @generated
     * @ordered
     */
    public static final int PWP_VALUE = 4;

    /**
     * The '<em><b>Tcwdu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tcwdu</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TCWDU
     * @model name="tcwdu"
     * @generated
     * @ordered
     */
    public static final int TCWDU_VALUE = 5;

    /**
     * The '<em><b>Tduwt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tduwt</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TDUWT
     * @model name="tduwt"
     * @generated
     * @ordered
     */
    public static final int TDUWT_VALUE = 6;

    /**
     * The '<em><b>Qmaxp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Qmaxp</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QMAXP
     * @model name="qmaxp"
     * @generated
     * @ordered
     */
    public static final int QMAXP_VALUE = 7;

    /**
     * The '<em><b>Qminp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Qminp</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QMINP
     * @model name="qminp"
     * @generated
     * @ordered
     */
    public static final int QMINP_VALUE = 8;

    /**
     * The '<em><b>Qmaxu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Qmaxu</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QMAXU
     * @model name="qmaxu"
     * @generated
     * @ordered
     */
    public static final int QMAXU_VALUE = 9;

    /**
     * The '<em><b>Qminu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Qminu</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QMINU
     * @model name="qminu"
     * @generated
     * @ordered
     */
    public static final int QMINU_VALUE = 10;

    /**
     * The '<em><b>Tuover</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tuover</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TUOVER
     * @model name="tuover"
     * @generated
     * @ordered
     */
    public static final int TUOVER_VALUE = 11;

    /**
     * The '<em><b>Tuunder</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tuunder</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TUUNDER
     * @model name="tuunder"
     * @generated
     * @ordered
     */
    public static final int TUUNDER_VALUE = 12;

    /**
     * The '<em><b>Tfover</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tfover</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TFOVER
     * @model name="tfover"
     * @generated
     * @ordered
     */
    public static final int TFOVER_VALUE = 13;

    /**
     * The '<em><b>Tfunder</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tfunder</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TFUNDER
     * @model name="tfunder"
     * @generated
     * @ordered
     */
    public static final int TFUNDER_VALUE = 14;

    /**
     * The '<em><b>Qwp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Qwp</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QWP
     * @model name="qwp"
     * @generated
     * @ordered
     */
    public static final int QWP_VALUE = 15;

    /**
     * An array of all the '<em><b>Wind Lookup Table Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindLookupTableFunctionKind[] VALUES_ARRAY = new WindLookupTableFunctionKind[] { PRR, OMEGAP,
            IPMAX, IQMAX, PWP, TCWDU, TDUWT, QMAXP, QMINP, QMAXU, QMINU, TUOVER, TUUNDER, TFOVER, TFUNDER, QWP, };

    /**
     * A public read-only list of all the '<em><b>Wind Lookup Table Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindLookupTableFunctionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WindLookupTableFunctionKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WindLookupTableFunctionKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind get( int value ) {
        switch( value ) {
        case PRR_VALUE:
            return PRR;
        case OMEGAP_VALUE:
            return OMEGAP;
        case IPMAX_VALUE:
            return IPMAX;
        case IQMAX_VALUE:
            return IQMAX;
        case PWP_VALUE:
            return PWP;
        case TCWDU_VALUE:
            return TCWDU;
        case TDUWT_VALUE:
            return TDUWT;
        case QMAXP_VALUE:
            return QMAXP;
        case QMINP_VALUE:
            return QMINP;
        case QMAXU_VALUE:
            return QMAXU;
        case QMINU_VALUE:
            return QMINU;
        case TUOVER_VALUE:
            return TUOVER;
        case TUUNDER_VALUE:
            return TUUNDER;
        case TFOVER_VALUE:
            return TFOVER;
        case TFUNDER_VALUE:
            return TFUNDER;
        case QWP_VALUE:
            return QWP;
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
    private WindLookupTableFunctionKind( int value, String name, String literal ) {
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

} //WindLookupTableFunctionKind
