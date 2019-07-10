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
 * A representation of the literals of the enumeration '<em><b>Vs Ppcc Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsPpccControlKind()
 * @model
 * @generated
 */
public enum VsPpccControlKind implements Enumerator {
    /**
     * The '<em><b>PPcc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PPCC_VALUE
     * @generated
     * @ordered
     */
    PPCC( 0, "pPcc", "pPcc" ),

    /**
     * The '<em><b>Udc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UDC_VALUE
     * @generated
     * @ordered
     */
    UDC( 1, "udc", "udc" ),

    /**
     * The '<em><b>PPcc And Udc Droop</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PPCC_AND_UDC_DROOP_VALUE
     * @generated
     * @ordered
     */
    PPCC_AND_UDC_DROOP( 2, "pPccAndUdcDroop", "pPccAndUdcDroop" ),

    /**
     * The '<em><b>PPcc And Udc Droop With Compensation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PPCC_AND_UDC_DROOP_WITH_COMPENSATION_VALUE
     * @generated
     * @ordered
     */
    PPCC_AND_UDC_DROOP_WITH_COMPENSATION( 3, "pPccAndUdcDroopWithCompensation", "pPccAndUdcDroopWithCompensation" ),

    /**
     * The '<em><b>PPcc And Udc Droop Pilot</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PPCC_AND_UDC_DROOP_PILOT_VALUE
     * @generated
     * @ordered
     */
    PPCC_AND_UDC_DROOP_PILOT( 4, "pPccAndUdcDroopPilot", "pPccAndUdcDroopPilot" );

    /**
     * The '<em><b>PPcc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PPcc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PPCC
     * @model name="pPcc"
     * @generated
     * @ordered
     */
    public static final int PPCC_VALUE = 0;

    /**
     * The '<em><b>Udc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Udc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UDC
     * @model name="udc"
     * @generated
     * @ordered
     */
    public static final int UDC_VALUE = 1;

    /**
     * The '<em><b>PPcc And Udc Droop</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PPcc And Udc Droop</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PPCC_AND_UDC_DROOP
     * @model name="pPccAndUdcDroop"
     * @generated
     * @ordered
     */
    public static final int PPCC_AND_UDC_DROOP_VALUE = 2;

    /**
     * The '<em><b>PPcc And Udc Droop With Compensation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PPcc And Udc Droop With Compensation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PPCC_AND_UDC_DROOP_WITH_COMPENSATION
     * @model name="pPccAndUdcDroopWithCompensation"
     * @generated
     * @ordered
     */
    public static final int PPCC_AND_UDC_DROOP_WITH_COMPENSATION_VALUE = 3;

    /**
     * The '<em><b>PPcc And Udc Droop Pilot</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PPcc And Udc Droop Pilot</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PPCC_AND_UDC_DROOP_PILOT
     * @model name="pPccAndUdcDroopPilot"
     * @generated
     * @ordered
     */
    public static final int PPCC_AND_UDC_DROOP_PILOT_VALUE = 4;

    /**
     * An array of all the '<em><b>Vs Ppcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final VsPpccControlKind[] VALUES_ARRAY = new VsPpccControlKind[] { PPCC, UDC, PPCC_AND_UDC_DROOP,
            PPCC_AND_UDC_DROOP_WITH_COMPENSATION, PPCC_AND_UDC_DROOP_PILOT, };

    /**
     * A public read-only list of all the '<em><b>Vs Ppcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< VsPpccControlKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Vs Ppcc Control Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsPpccControlKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            VsPpccControlKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Vs Ppcc Control Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsPpccControlKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            VsPpccControlKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Vs Ppcc Control Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsPpccControlKind get( int value ) {
        switch( value ) {
        case PPCC_VALUE:
            return PPCC;
        case UDC_VALUE:
            return UDC;
        case PPCC_AND_UDC_DROOP_VALUE:
            return PPCC_AND_UDC_DROOP;
        case PPCC_AND_UDC_DROOP_WITH_COMPENSATION_VALUE:
            return PPCC_AND_UDC_DROOP_WITH_COMPENSATION;
        case PPCC_AND_UDC_DROOP_PILOT_VALUE:
            return PPCC_AND_UDC_DROOP_PILOT;
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
    private VsPpccControlKind( int value, String name, String literal ) {
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

} //VsPpccControlKind
