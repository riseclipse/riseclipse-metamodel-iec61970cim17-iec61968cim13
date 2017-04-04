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
 * A representation of the literals of the enumeration '<em><b>Hydro Plant Storage Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPlantStorageKind()
 * @model
 * @generated
 */
public enum HydroPlantStorageKind implements Enumerator {
    /**
     * The '<em><b>Run Of River</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RUN_OF_RIVER_VALUE
     * @generated
     * @ordered
     */
    RUN_OF_RIVER( 0, "runOfRiver", "runOfRiver" ),

    /**
     * The '<em><b>Pumped Storage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUMPED_STORAGE_VALUE
     * @generated
     * @ordered
     */
    PUMPED_STORAGE( 1, "pumpedStorage", "pumpedStorage" ),

    /**
     * The '<em><b>Storage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STORAGE_VALUE
     * @generated
     * @ordered
     */
    STORAGE( 2, "storage", "storage" );

    /**
     * The '<em><b>Run Of River</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Run Of River</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RUN_OF_RIVER
     * @model name="runOfRiver"
     * @generated
     * @ordered
     */
    public static final int RUN_OF_RIVER_VALUE = 0;

    /**
     * The '<em><b>Pumped Storage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pumped Storage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUMPED_STORAGE
     * @model name="pumpedStorage"
     * @generated
     * @ordered
     */
    public static final int PUMPED_STORAGE_VALUE = 1;

    /**
     * The '<em><b>Storage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Storage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STORAGE
     * @model name="storage"
     * @generated
     * @ordered
     */
    public static final int STORAGE_VALUE = 2;

    /**
     * An array of all the '<em><b>Hydro Plant Storage Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final HydroPlantStorageKind[] VALUES_ARRAY = new HydroPlantStorageKind[] { RUN_OF_RIVER,
            PUMPED_STORAGE, STORAGE, };

    /**
     * A public read-only list of all the '<em><b>Hydro Plant Storage Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< HydroPlantStorageKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Hydro Plant Storage Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HydroPlantStorageKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            HydroPlantStorageKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Hydro Plant Storage Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HydroPlantStorageKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            HydroPlantStorageKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Hydro Plant Storage Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HydroPlantStorageKind get( int value ) {
        switch( value ) {
        case RUN_OF_RIVER_VALUE:
            return RUN_OF_RIVER;
        case PUMPED_STORAGE_VALUE:
            return PUMPED_STORAGE;
        case STORAGE_VALUE:
            return STORAGE;
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
    private HydroPlantStorageKind( int value, String name, String literal ) {
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

} //HydroPlantStorageKind
