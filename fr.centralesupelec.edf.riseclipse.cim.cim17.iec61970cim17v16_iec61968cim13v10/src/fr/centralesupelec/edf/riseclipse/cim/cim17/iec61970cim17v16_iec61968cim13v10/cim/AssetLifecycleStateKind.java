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
 * A representation of the literals of the enumeration '<em><b>Asset Lifecycle State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetLifecycleStateKind()
 * @model
 * @generated
 */
public enum AssetLifecycleStateKind implements Enumerator {
    /**
     * The '<em><b>Manufactured</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MANUFACTURED_VALUE
     * @generated
     * @ordered
     */
    MANUFACTURED( 0, "manufactured", "manufactured" ),

    /**
     * The '<em><b>Purchased</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PURCHASED_VALUE
     * @generated
     * @ordered
     */
    PURCHASED( 1, "purchased", "purchased" ),

    /**
     * The '<em><b>Received</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RECEIVED_VALUE
     * @generated
     * @ordered
     */
    RECEIVED( 2, "received", "received" ),

    /**
     * The '<em><b>Retired</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RETIRED_VALUE
     * @generated
     * @ordered
     */
    RETIRED( 3, "retired", "retired" ),

    /**
     * The '<em><b>Disposed Of</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISPOSED_OF_VALUE
     * @generated
     * @ordered
     */
    DISPOSED_OF( 4, "disposedOf", "disposedOf" );

    /**
     * The '<em><b>Manufactured</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Manufactured</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MANUFACTURED
     * @model name="manufactured"
     * @generated
     * @ordered
     */
    public static final int MANUFACTURED_VALUE = 0;

    /**
     * The '<em><b>Purchased</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Purchased</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PURCHASED
     * @model name="purchased"
     * @generated
     * @ordered
     */
    public static final int PURCHASED_VALUE = 1;

    /**
     * The '<em><b>Received</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Received</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RECEIVED
     * @model name="received"
     * @generated
     * @ordered
     */
    public static final int RECEIVED_VALUE = 2;

    /**
     * The '<em><b>Retired</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Retired</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RETIRED
     * @model name="retired"
     * @generated
     * @ordered
     */
    public static final int RETIRED_VALUE = 3;

    /**
     * The '<em><b>Disposed Of</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Disposed Of</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISPOSED_OF
     * @model name="disposedOf"
     * @generated
     * @ordered
     */
    public static final int DISPOSED_OF_VALUE = 4;

    /**
     * An array of all the '<em><b>Asset Lifecycle State Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AssetLifecycleStateKind[] VALUES_ARRAY = new AssetLifecycleStateKind[] { MANUFACTURED,
            PURCHASED, RECEIVED, RETIRED, DISPOSED_OF, };

    /**
     * A public read-only list of all the '<em><b>Asset Lifecycle State Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AssetLifecycleStateKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Asset Lifecycle State Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetLifecycleStateKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetLifecycleStateKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Lifecycle State Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetLifecycleStateKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetLifecycleStateKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Lifecycle State Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetLifecycleStateKind get( int value ) {
        switch( value ) {
        case MANUFACTURED_VALUE:
            return MANUFACTURED;
        case PURCHASED_VALUE:
            return PURCHASED;
        case RECEIVED_VALUE:
            return RECEIVED;
        case RETIRED_VALUE:
            return RETIRED;
        case DISPOSED_OF_VALUE:
            return DISPOSED_OF;
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
    private AssetLifecycleStateKind( int value, String name, String literal ) {
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

} //AssetLifecycleStateKind
