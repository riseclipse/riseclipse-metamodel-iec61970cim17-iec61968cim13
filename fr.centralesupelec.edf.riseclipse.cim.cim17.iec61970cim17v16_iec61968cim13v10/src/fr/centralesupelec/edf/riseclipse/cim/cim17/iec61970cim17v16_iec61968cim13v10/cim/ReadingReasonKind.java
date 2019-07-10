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
 * A representation of the literals of the enumeration '<em><b>Reading Reason Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingReasonKind()
 * @model
 * @generated
 */
public enum ReadingReasonKind implements Enumerator {
    /**
     * The '<em><b>Installation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSTALLATION_VALUE
     * @generated
     * @ordered
     */
    INSTALLATION( 0, "installation", "installation" ),

    /**
     * The '<em><b>Removal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOVAL_VALUE
     * @generated
     * @ordered
     */
    REMOVAL( 1, "removal", "removal" ),

    /**
     * The '<em><b>Inquiry</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INQUIRY_VALUE
     * @generated
     * @ordered
     */
    INQUIRY( 2, "inquiry", "inquiry" ),

    /**
     * The '<em><b>Billing</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BILLING_VALUE
     * @generated
     * @ordered
     */
    BILLING( 3, "billing", "billing" ),

    /**
     * The '<em><b>Move In</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOVE_IN_VALUE
     * @generated
     * @ordered
     */
    MOVE_IN( 4, "moveIn", "moveIn" ),

    /**
     * The '<em><b>Move Out</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOVE_OUT_VALUE
     * @generated
     * @ordered
     */
    MOVE_OUT( 5, "moveOut", "moveOut" ),

    /**
     * The '<em><b>Demand Reset</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEMAND_RESET_VALUE
     * @generated
     * @ordered
     */
    DEMAND_RESET( 6, "demandReset", "demandReset" ),

    /**
     * The '<em><b>Service Disconnect</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SERVICE_DISCONNECT_VALUE
     * @generated
     * @ordered
     */
    SERVICE_DISCONNECT( 7, "serviceDisconnect", "serviceDisconnect" ),

    /**
     * The '<em><b>Service Connect</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SERVICE_CONNECT_VALUE
     * @generated
     * @ordered
     */
    SERVICE_CONNECT( 8, "serviceConnect", "serviceConnect" ),

    /**
     * The '<em><b>Load Management</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOAD_MANAGEMENT_VALUE
     * @generated
     * @ordered
     */
    LOAD_MANAGEMENT( 9, "loadManagement", "loadManagement" ),

    /**
     * The '<em><b>Load Research</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOAD_RESEARCH_VALUE
     * @generated
     * @ordered
     */
    LOAD_RESEARCH( 10, "loadResearch", "loadResearch" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 11, "other", "other" );

    /**
     * The '<em><b>Installation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Installation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSTALLATION
     * @model name="installation"
     * @generated
     * @ordered
     */
    public static final int INSTALLATION_VALUE = 0;

    /**
     * The '<em><b>Removal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Removal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOVAL
     * @model name="removal"
     * @generated
     * @ordered
     */
    public static final int REMOVAL_VALUE = 1;

    /**
     * The '<em><b>Inquiry</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inquiry</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INQUIRY
     * @model name="inquiry"
     * @generated
     * @ordered
     */
    public static final int INQUIRY_VALUE = 2;

    /**
     * The '<em><b>Billing</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Billing</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BILLING
     * @model name="billing"
     * @generated
     * @ordered
     */
    public static final int BILLING_VALUE = 3;

    /**
     * The '<em><b>Move In</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Move In</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOVE_IN
     * @model name="moveIn"
     * @generated
     * @ordered
     */
    public static final int MOVE_IN_VALUE = 4;

    /**
     * The '<em><b>Move Out</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Move Out</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOVE_OUT
     * @model name="moveOut"
     * @generated
     * @ordered
     */
    public static final int MOVE_OUT_VALUE = 5;

    /**
     * The '<em><b>Demand Reset</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Demand Reset</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEMAND_RESET
     * @model name="demandReset"
     * @generated
     * @ordered
     */
    public static final int DEMAND_RESET_VALUE = 6;

    /**
     * The '<em><b>Service Disconnect</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Service Disconnect</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SERVICE_DISCONNECT
     * @model name="serviceDisconnect"
     * @generated
     * @ordered
     */
    public static final int SERVICE_DISCONNECT_VALUE = 7;

    /**
     * The '<em><b>Service Connect</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Service Connect</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SERVICE_CONNECT
     * @model name="serviceConnect"
     * @generated
     * @ordered
     */
    public static final int SERVICE_CONNECT_VALUE = 8;

    /**
     * The '<em><b>Load Management</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Load Management</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOAD_MANAGEMENT
     * @model name="loadManagement"
     * @generated
     * @ordered
     */
    public static final int LOAD_MANAGEMENT_VALUE = 9;

    /**
     * The '<em><b>Load Research</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Load Research</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOAD_RESEARCH
     * @model name="loadResearch"
     * @generated
     * @ordered
     */
    public static final int LOAD_RESEARCH_VALUE = 10;

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
    public static final int OTHER_VALUE = 11;

    /**
     * An array of all the '<em><b>Reading Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ReadingReasonKind[] VALUES_ARRAY = new ReadingReasonKind[] { INSTALLATION, REMOVAL, INQUIRY,
            BILLING, MOVE_IN, MOVE_OUT, DEMAND_RESET, SERVICE_DISCONNECT, SERVICE_CONNECT, LOAD_MANAGEMENT,
            LOAD_RESEARCH, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Reading Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ReadingReasonKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Reading Reason Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ReadingReasonKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ReadingReasonKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Reading Reason Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ReadingReasonKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ReadingReasonKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Reading Reason Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ReadingReasonKind get( int value ) {
        switch( value ) {
        case INSTALLATION_VALUE:
            return INSTALLATION;
        case REMOVAL_VALUE:
            return REMOVAL;
        case INQUIRY_VALUE:
            return INQUIRY;
        case BILLING_VALUE:
            return BILLING;
        case MOVE_IN_VALUE:
            return MOVE_IN;
        case MOVE_OUT_VALUE:
            return MOVE_OUT;
        case DEMAND_RESET_VALUE:
            return DEMAND_RESET;
        case SERVICE_DISCONNECT_VALUE:
            return SERVICE_DISCONNECT;
        case SERVICE_CONNECT_VALUE:
            return SERVICE_CONNECT;
        case LOAD_MANAGEMENT_VALUE:
            return LOAD_MANAGEMENT;
        case LOAD_RESEARCH_VALUE:
            return LOAD_RESEARCH;
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
    private ReadingReasonKind( int value, String name, String literal ) {
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

} //ReadingReasonKind
