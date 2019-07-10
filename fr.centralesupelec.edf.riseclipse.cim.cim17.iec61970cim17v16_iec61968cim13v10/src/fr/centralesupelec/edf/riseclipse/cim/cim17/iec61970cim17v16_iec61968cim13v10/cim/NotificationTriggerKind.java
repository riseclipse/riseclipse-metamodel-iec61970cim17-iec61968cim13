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
 * A representation of the literals of the enumeration '<em><b>Notification Trigger Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNotificationTriggerKind()
 * @model
 * @generated
 */
public enum NotificationTriggerKind implements Enumerator {
    /**
     * The '<em><b>Initial Etr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INITIAL_ETR_VALUE
     * @generated
     * @ordered
     */
    INITIAL_ETR( 0, "initialEtr", "initialEtr" ),

    /**
     * The '<em><b>Etr Change</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ETR_CHANGE_VALUE
     * @generated
     * @ordered
     */
    ETR_CHANGE( 1, "etrChange", "etrChange" ),

    /**
     * The '<em><b>Power Restored</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_RESTORED_VALUE
     * @generated
     * @ordered
     */
    POWER_RESTORED( 2, "powerRestored", "powerRestored" ),

    /**
     * The '<em><b>Power Out</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_OUT_VALUE
     * @generated
     * @ordered
     */
    POWER_OUT( 3, "powerOut", "powerOut" ),

    /**
     * The '<em><b>Inform Dispatched</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INFORM_DISPATCHED_VALUE
     * @generated
     * @ordered
     */
    INFORM_DISPATCHED( 4, "informDispatched", "informDispatched" );

    /**
     * The '<em><b>Initial Etr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Initial Etr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INITIAL_ETR
     * @model name="initialEtr"
     * @generated
     * @ordered
     */
    public static final int INITIAL_ETR_VALUE = 0;

    /**
     * The '<em><b>Etr Change</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Etr Change</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ETR_CHANGE
     * @model name="etrChange"
     * @generated
     * @ordered
     */
    public static final int ETR_CHANGE_VALUE = 1;

    /**
     * The '<em><b>Power Restored</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Restored</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_RESTORED
     * @model name="powerRestored"
     * @generated
     * @ordered
     */
    public static final int POWER_RESTORED_VALUE = 2;

    /**
     * The '<em><b>Power Out</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Out</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_OUT
     * @model name="powerOut"
     * @generated
     * @ordered
     */
    public static final int POWER_OUT_VALUE = 3;

    /**
     * The '<em><b>Inform Dispatched</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inform Dispatched</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INFORM_DISPATCHED
     * @model name="informDispatched"
     * @generated
     * @ordered
     */
    public static final int INFORM_DISPATCHED_VALUE = 4;

    /**
     * An array of all the '<em><b>Notification Trigger Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NotificationTriggerKind[] VALUES_ARRAY = new NotificationTriggerKind[] { INITIAL_ETR,
            ETR_CHANGE, POWER_RESTORED, POWER_OUT, INFORM_DISPATCHED, };

    /**
     * A public read-only list of all the '<em><b>Notification Trigger Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< NotificationTriggerKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Notification Trigger Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NotificationTriggerKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            NotificationTriggerKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Notification Trigger Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NotificationTriggerKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            NotificationTriggerKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Notification Trigger Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NotificationTriggerKind get( int value ) {
        switch( value ) {
        case INITIAL_ETR_VALUE:
            return INITIAL_ETR;
        case ETR_CHANGE_VALUE:
            return ETR_CHANGE;
        case POWER_RESTORED_VALUE:
            return POWER_RESTORED;
        case POWER_OUT_VALUE:
            return POWER_OUT;
        case INFORM_DISPATCHED_VALUE:
            return INFORM_DISPATCHED;
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
    private NotificationTriggerKind( int value, String name, String literal ) {
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

} //NotificationTriggerKind
