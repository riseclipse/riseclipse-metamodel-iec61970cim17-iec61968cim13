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
 * A representation of the literals of the enumeration '<em><b>Work Status Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkStatusKind()
 * @model
 * @generated
 */
public enum WorkStatusKind implements Enumerator {
    /**
     * The '<em><b>Waiting On Approval</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WAITING_ON_APPROVAL_VALUE
     * @generated
     * @ordered
     */
    WAITING_ON_APPROVAL( 0, "waitingOnApproval", "waitingOnApproval" ),

    /**
     * The '<em><b>Approved</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #APPROVED_VALUE
     * @generated
     * @ordered
     */
    APPROVED( 1, "approved", "approved" ),

    /**
     * The '<em><b>Cancelled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CANCELLED_VALUE
     * @generated
     * @ordered
     */
    CANCELLED( 2, "cancelled", "cancelled" ),

    /**
     * The '<em><b>Waiting To Be Scheduled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WAITING_TO_BE_SCHEDULED_VALUE
     * @generated
     * @ordered
     */
    WAITING_TO_BE_SCHEDULED( 3, "waitingToBeScheduled", "waitingToBeScheduled" ),

    /**
     * The '<em><b>Scheduled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SCHEDULED_VALUE
     * @generated
     * @ordered
     */
    SCHEDULED( 4, "scheduled", "scheduled" ),

    /**
     * The '<em><b>Waiting On Material</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WAITING_ON_MATERIAL_VALUE
     * @generated
     * @ordered
     */
    WAITING_ON_MATERIAL( 5, "waitingOnMaterial", "waitingOnMaterial" ),

    /**
     * The '<em><b>In Progress</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_PROGRESS_VALUE
     * @generated
     * @ordered
     */
    IN_PROGRESS( 6, "inProgress", "inProgress" ),

    /**
     * The '<em><b>Completed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPLETED_VALUE
     * @generated
     * @ordered
     */
    COMPLETED( 7, "completed", "completed" ),

    /**
     * The '<em><b>Closed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOSED_VALUE
     * @generated
     * @ordered
     */
    CLOSED( 8, "closed", "closed" ),

    /**
     * The '<em><b>Dispatched</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISPATCHED_VALUE
     * @generated
     * @ordered
     */
    DISPATCHED( 9, "dispatched", "dispatched" ),

    /**
     * The '<em><b>Enroute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENROUTE_VALUE
     * @generated
     * @ordered
     */
    ENROUTE( 10, "enroute", "enroute" ),

    /**
     * The '<em><b>On Site</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ON_SITE_VALUE
     * @generated
     * @ordered
     */
    ON_SITE( 11, "onSite", "onSite" );

    /**
     * The '<em><b>Waiting On Approval</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Waiting On Approval</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WAITING_ON_APPROVAL
     * @model name="waitingOnApproval"
     * @generated
     * @ordered
     */
    public static final int WAITING_ON_APPROVAL_VALUE = 0;

    /**
     * The '<em><b>Approved</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Approved</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #APPROVED
     * @model name="approved"
     * @generated
     * @ordered
     */
    public static final int APPROVED_VALUE = 1;

    /**
     * The '<em><b>Cancelled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cancelled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CANCELLED
     * @model name="cancelled"
     * @generated
     * @ordered
     */
    public static final int CANCELLED_VALUE = 2;

    /**
     * The '<em><b>Waiting To Be Scheduled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Waiting To Be Scheduled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WAITING_TO_BE_SCHEDULED
     * @model name="waitingToBeScheduled"
     * @generated
     * @ordered
     */
    public static final int WAITING_TO_BE_SCHEDULED_VALUE = 3;

    /**
     * The '<em><b>Scheduled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Scheduled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SCHEDULED
     * @model name="scheduled"
     * @generated
     * @ordered
     */
    public static final int SCHEDULED_VALUE = 4;

    /**
     * The '<em><b>Waiting On Material</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Waiting On Material</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WAITING_ON_MATERIAL
     * @model name="waitingOnMaterial"
     * @generated
     * @ordered
     */
    public static final int WAITING_ON_MATERIAL_VALUE = 5;

    /**
     * The '<em><b>In Progress</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>In Progress</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IN_PROGRESS
     * @model name="inProgress"
     * @generated
     * @ordered
     */
    public static final int IN_PROGRESS_VALUE = 6;

    /**
     * The '<em><b>Completed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Completed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMPLETED
     * @model name="completed"
     * @generated
     * @ordered
     */
    public static final int COMPLETED_VALUE = 7;

    /**
     * The '<em><b>Closed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Closed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CLOSED
     * @model name="closed"
     * @generated
     * @ordered
     */
    public static final int CLOSED_VALUE = 8;

    /**
     * The '<em><b>Dispatched</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dispatched</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISPATCHED
     * @model name="dispatched"
     * @generated
     * @ordered
     */
    public static final int DISPATCHED_VALUE = 9;

    /**
     * The '<em><b>Enroute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Enroute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENROUTE
     * @model name="enroute"
     * @generated
     * @ordered
     */
    public static final int ENROUTE_VALUE = 10;

    /**
     * The '<em><b>On Site</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>On Site</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ON_SITE
     * @model name="onSite"
     * @generated
     * @ordered
     */
    public static final int ON_SITE_VALUE = 11;

    /**
     * An array of all the '<em><b>Work Status Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WorkStatusKind[] VALUES_ARRAY = new WorkStatusKind[] { WAITING_ON_APPROVAL, APPROVED,
            CANCELLED, WAITING_TO_BE_SCHEDULED, SCHEDULED, WAITING_ON_MATERIAL, IN_PROGRESS, COMPLETED, CLOSED,
            DISPATCHED, ENROUTE, ON_SITE, };

    /**
     * A public read-only list of all the '<em><b>Work Status Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WorkStatusKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Work Status Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkStatusKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WorkStatusKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Work Status Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkStatusKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WorkStatusKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Work Status Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkStatusKind get( int value ) {
        switch( value ) {
        case WAITING_ON_APPROVAL_VALUE:
            return WAITING_ON_APPROVAL;
        case APPROVED_VALUE:
            return APPROVED;
        case CANCELLED_VALUE:
            return CANCELLED;
        case WAITING_TO_BE_SCHEDULED_VALUE:
            return WAITING_TO_BE_SCHEDULED;
        case SCHEDULED_VALUE:
            return SCHEDULED;
        case WAITING_ON_MATERIAL_VALUE:
            return WAITING_ON_MATERIAL;
        case IN_PROGRESS_VALUE:
            return IN_PROGRESS;
        case COMPLETED_VALUE:
            return COMPLETED;
        case CLOSED_VALUE:
            return CLOSED;
        case DISPATCHED_VALUE:
            return DISPATCHED;
        case ENROUTE_VALUE:
            return ENROUTE;
        case ON_SITE_VALUE:
            return ON_SITE;
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
    private WorkStatusKind( int value, String name, String literal ) {
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

} //WorkStatusKind
