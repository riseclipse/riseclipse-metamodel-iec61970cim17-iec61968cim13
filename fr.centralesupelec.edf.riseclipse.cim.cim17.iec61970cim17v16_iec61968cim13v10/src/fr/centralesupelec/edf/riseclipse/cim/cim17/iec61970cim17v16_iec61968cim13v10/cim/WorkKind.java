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
 * A representation of the literals of the enumeration '<em><b>Work Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkKind()
 * @model
 * @generated
 */
public enum WorkKind implements Enumerator {
    /**
     * The '<em><b>Construction</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONSTRUCTION_VALUE
     * @generated
     * @ordered
     */
    CONSTRUCTION( 0, "construction", "construction" ),

    /**
     * The '<em><b>Inspection</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSPECTION_VALUE
     * @generated
     * @ordered
     */
    INSPECTION( 1, "inspection", "inspection" ),

    /**
     * The '<em><b>Maintenance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAINTENANCE_VALUE
     * @generated
     * @ordered
     */
    MAINTENANCE( 2, "maintenance", "maintenance" ),

    /**
     * The '<em><b>Repair</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REPAIR_VALUE
     * @generated
     * @ordered
     */
    REPAIR( 3, "repair", "repair" ),

    /**
     * The '<em><b>Test</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEST_VALUE
     * @generated
     * @ordered
     */
    TEST( 4, "test", "test" ),

    /**
     * The '<em><b>Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SERVICE_VALUE
     * @generated
     * @ordered
     */
    SERVICE( 5, "service", "service" ),

    /**
     * The '<em><b>Disconnect</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISCONNECT_VALUE
     * @generated
     * @ordered
     */
    DISCONNECT( 6, "disconnect", "disconnect" ),

    /**
     * The '<em><b>Reconnect</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RECONNECT_VALUE
     * @generated
     * @ordered
     */
    RECONNECT( 7, "reconnect", "reconnect" ),

    /**
     * The '<em><b>Connect</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONNECT_VALUE
     * @generated
     * @ordered
     */
    CONNECT( 8, "connect", "connect" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 9, "other", "other" ),

    /**
     * The '<em><b>Refurbishment</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFURBISHMENT_VALUE
     * @generated
     * @ordered
     */
    REFURBISHMENT( 10, "refurbishment", "refurbishment" );

    /**
     * The '<em><b>Construction</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Construction</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONSTRUCTION
     * @model name="construction"
     * @generated
     * @ordered
     */
    public static final int CONSTRUCTION_VALUE = 0;

    /**
     * The '<em><b>Inspection</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inspection</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSPECTION
     * @model name="inspection"
     * @generated
     * @ordered
     */
    public static final int INSPECTION_VALUE = 1;

    /**
     * The '<em><b>Maintenance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAINTENANCE
     * @model name="maintenance"
     * @generated
     * @ordered
     */
    public static final int MAINTENANCE_VALUE = 2;

    /**
     * The '<em><b>Repair</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Repair</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REPAIR
     * @model name="repair"
     * @generated
     * @ordered
     */
    public static final int REPAIR_VALUE = 3;

    /**
     * The '<em><b>Test</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEST
     * @model name="test"
     * @generated
     * @ordered
     */
    public static final int TEST_VALUE = 4;

    /**
     * The '<em><b>Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SERVICE
     * @model name="service"
     * @generated
     * @ordered
     */
    public static final int SERVICE_VALUE = 5;

    /**
     * The '<em><b>Disconnect</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Disconnect</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISCONNECT
     * @model name="disconnect"
     * @generated
     * @ordered
     */
    public static final int DISCONNECT_VALUE = 6;

    /**
     * The '<em><b>Reconnect</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reconnect</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RECONNECT
     * @model name="reconnect"
     * @generated
     * @ordered
     */
    public static final int RECONNECT_VALUE = 7;

    /**
     * The '<em><b>Connect</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Connect</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONNECT
     * @model name="connect"
     * @generated
     * @ordered
     */
    public static final int CONNECT_VALUE = 8;

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
    public static final int OTHER_VALUE = 9;

    /**
     * The '<em><b>Refurbishment</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Refurbishment</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REFURBISHMENT
     * @model name="refurbishment"
     * @generated
     * @ordered
     */
    public static final int REFURBISHMENT_VALUE = 10;

    /**
     * An array of all the '<em><b>Work Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WorkKind[] VALUES_ARRAY = new WorkKind[] { CONSTRUCTION, INSPECTION, MAINTENANCE, REPAIR, TEST,
            SERVICE, DISCONNECT, RECONNECT, CONNECT, OTHER, REFURBISHMENT, };

    /**
     * A public read-only list of all the '<em><b>Work Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WorkKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Work Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WorkKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Work Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WorkKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Work Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkKind get( int value ) {
        switch( value ) {
        case CONSTRUCTION_VALUE:
            return CONSTRUCTION;
        case INSPECTION_VALUE:
            return INSPECTION;
        case MAINTENANCE_VALUE:
            return MAINTENANCE;
        case REPAIR_VALUE:
            return REPAIR;
        case TEST_VALUE:
            return TEST;
        case SERVICE_VALUE:
            return SERVICE;
        case DISCONNECT_VALUE:
            return DISCONNECT;
        case RECONNECT_VALUE:
            return RECONNECT;
        case CONNECT_VALUE:
            return CONNECT;
        case OTHER_VALUE:
            return OTHER;
        case REFURBISHMENT_VALUE:
            return REFURBISHMENT;
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
    private WorkKind( int value, String name, String literal ) {
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

} //WorkKind
