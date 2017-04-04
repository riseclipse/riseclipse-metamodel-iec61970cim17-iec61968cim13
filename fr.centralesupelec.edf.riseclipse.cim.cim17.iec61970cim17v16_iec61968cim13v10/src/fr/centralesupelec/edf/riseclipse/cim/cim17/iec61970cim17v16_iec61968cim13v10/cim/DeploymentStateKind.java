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
 * A representation of the literals of the enumeration '<em><b>Deployment State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentStateKind()
 * @model
 * @generated
 */
public enum DeploymentStateKind implements Enumerator {
    /**
     * The '<em><b>Not Yet Installed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_YET_INSTALLED_VALUE
     * @generated
     * @ordered
     */
    NOT_YET_INSTALLED( 0, "notYetInstalled", "notYetInstalled" ),

    /**
     * The '<em><b>Installed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSTALLED_VALUE
     * @generated
     * @ordered
     */
    INSTALLED( 1, "installed", "installed" ),

    /**
     * The '<em><b>In Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_SERVICE_VALUE
     * @generated
     * @ordered
     */
    IN_SERVICE( 2, "inService", "inService" ),

    /**
     * The '<em><b>Out Of Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUT_OF_SERVICE_VALUE
     * @generated
     * @ordered
     */
    OUT_OF_SERVICE( 3, "outOfService", "outOfService" ),

    /**
     * The '<em><b>Removed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOVED_VALUE
     * @generated
     * @ordered
     */
    REMOVED( 4, "removed", "removed" );

    /**
     * The '<em><b>Not Yet Installed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Not Yet Installed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOT_YET_INSTALLED
     * @model name="notYetInstalled"
     * @generated
     * @ordered
     */
    public static final int NOT_YET_INSTALLED_VALUE = 0;

    /**
     * The '<em><b>Installed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Installed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSTALLED
     * @model name="installed"
     * @generated
     * @ordered
     */
    public static final int INSTALLED_VALUE = 1;

    /**
     * The '<em><b>In Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>In Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IN_SERVICE
     * @model name="inService"
     * @generated
     * @ordered
     */
    public static final int IN_SERVICE_VALUE = 2;

    /**
     * The '<em><b>Out Of Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Out Of Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OUT_OF_SERVICE
     * @model name="outOfService"
     * @generated
     * @ordered
     */
    public static final int OUT_OF_SERVICE_VALUE = 3;

    /**
     * The '<em><b>Removed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Removed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOVED
     * @model name="removed"
     * @generated
     * @ordered
     */
    public static final int REMOVED_VALUE = 4;

    /**
     * An array of all the '<em><b>Deployment State Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DeploymentStateKind[] VALUES_ARRAY = new DeploymentStateKind[] { NOT_YET_INSTALLED, INSTALLED,
            IN_SERVICE, OUT_OF_SERVICE, REMOVED, };

    /**
     * A public read-only list of all the '<em><b>Deployment State Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< DeploymentStateKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Deployment State Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DeploymentStateKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            DeploymentStateKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Deployment State Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DeploymentStateKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            DeploymentStateKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Deployment State Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DeploymentStateKind get( int value ) {
        switch( value ) {
        case NOT_YET_INSTALLED_VALUE:
            return NOT_YET_INSTALLED;
        case INSTALLED_VALUE:
            return INSTALLED;
        case IN_SERVICE_VALUE:
            return IN_SERVICE;
        case OUT_OF_SERVICE_VALUE:
            return OUT_OF_SERVICE;
        case REMOVED_VALUE:
            return REMOVED;
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
    private DeploymentStateKind( int value, String name, String literal ) {
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

} //DeploymentStateKind
