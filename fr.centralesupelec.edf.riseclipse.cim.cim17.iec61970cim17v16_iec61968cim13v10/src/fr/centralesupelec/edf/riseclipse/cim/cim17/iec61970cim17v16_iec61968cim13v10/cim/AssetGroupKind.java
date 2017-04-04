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
 * A representation of the literals of the enumeration '<em><b>Asset Group Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetGroupKind()
 * @model
 * @generated
 */
public enum AssetGroupKind implements Enumerator {
    /**
     * The '<em><b>Analysis Group</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ANALYSIS_GROUP_VALUE
     * @generated
     * @ordered
     */
    ANALYSIS_GROUP( 0, "analysisGroup", "analysisGroup" ),

    /**
     * The '<em><b>Inventory Group</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INVENTORY_GROUP_VALUE
     * @generated
     * @ordered
     */
    INVENTORY_GROUP( 1, "inventoryGroup", "inventoryGroup" ),

    /**
     * The '<em><b>Compliance Group</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPLIANCE_GROUP_VALUE
     * @generated
     * @ordered
     */
    COMPLIANCE_GROUP( 2, "complianceGroup", "complianceGroup" ),

    /**
     * The '<em><b>Functional Group</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FUNCTIONAL_GROUP_VALUE
     * @generated
     * @ordered
     */
    FUNCTIONAL_GROUP( 3, "functionalGroup", "functionalGroup" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 4, "other", "other" );

    /**
     * The '<em><b>Analysis Group</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Analysis Group</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ANALYSIS_GROUP
     * @model name="analysisGroup"
     * @generated
     * @ordered
     */
    public static final int ANALYSIS_GROUP_VALUE = 0;

    /**
     * The '<em><b>Inventory Group</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inventory Group</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INVENTORY_GROUP
     * @model name="inventoryGroup"
     * @generated
     * @ordered
     */
    public static final int INVENTORY_GROUP_VALUE = 1;

    /**
     * The '<em><b>Compliance Group</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Compliance Group</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMPLIANCE_GROUP
     * @model name="complianceGroup"
     * @generated
     * @ordered
     */
    public static final int COMPLIANCE_GROUP_VALUE = 2;

    /**
     * The '<em><b>Functional Group</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Functional Group</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FUNCTIONAL_GROUP
     * @model name="functionalGroup"
     * @generated
     * @ordered
     */
    public static final int FUNCTIONAL_GROUP_VALUE = 3;

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
    public static final int OTHER_VALUE = 4;

    /**
     * An array of all the '<em><b>Asset Group Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AssetGroupKind[] VALUES_ARRAY = new AssetGroupKind[] { ANALYSIS_GROUP, INVENTORY_GROUP,
            COMPLIANCE_GROUP, FUNCTIONAL_GROUP, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Asset Group Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AssetGroupKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Asset Group Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetGroupKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetGroupKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Group Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetGroupKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetGroupKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Group Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetGroupKind get( int value ) {
        switch( value ) {
        case ANALYSIS_GROUP_VALUE:
            return ANALYSIS_GROUP;
        case INVENTORY_GROUP_VALUE:
            return INVENTORY_GROUP;
        case COMPLIANCE_GROUP_VALUE:
            return COMPLIANCE_GROUP;
        case FUNCTIONAL_GROUP_VALUE:
            return FUNCTIONAL_GROUP;
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
    private AssetGroupKind( int value, String name, String literal ) {
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

} //AssetGroupKind
