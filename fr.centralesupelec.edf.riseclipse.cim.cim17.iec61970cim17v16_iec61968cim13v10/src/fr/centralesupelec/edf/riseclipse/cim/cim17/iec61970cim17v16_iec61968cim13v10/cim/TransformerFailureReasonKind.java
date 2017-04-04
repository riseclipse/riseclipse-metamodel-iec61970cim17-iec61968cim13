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
 * A representation of the literals of the enumeration '<em><b>Transformer Failure Reason Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerFailureReasonKind()
 * @model
 * @generated
 */
public enum TransformerFailureReasonKind implements Enumerator {
    /**
     * The '<em><b>Bushing Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUSHING_FAILURE_VALUE
     * @generated
     * @ordered
     */
    BUSHING_FAILURE( 0, "bushingFailure", "bushingFailure" ),

    /**
     * The '<em><b>Loss Of Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOSS_OF_OIL_VALUE
     * @generated
     * @ordered
     */
    LOSS_OF_OIL( 1, "lossOfOil", "lossOfOil" ),

    /**
     * The '<em><b>Oil Related Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_RELATED_FAILURE_VALUE
     * @generated
     * @ordered
     */
    OIL_RELATED_FAILURE( 2, "oilRelatedFailure", "oilRelatedFailure" ),

    /**
     * The '<em><b>Poor Oil Quality</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POOR_OIL_QUALITY_VALUE
     * @generated
     * @ordered
     */
    POOR_OIL_QUALITY( 3, "poorOilQuality", "poorOilQuality" );

    /**
     * The '<em><b>Bushing Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bushing Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUSHING_FAILURE
     * @model name="bushingFailure"
     * @generated
     * @ordered
     */
    public static final int BUSHING_FAILURE_VALUE = 0;

    /**
     * The '<em><b>Loss Of Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Loss Of Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOSS_OF_OIL
     * @model name="lossOfOil"
     * @generated
     * @ordered
     */
    public static final int LOSS_OF_OIL_VALUE = 1;

    /**
     * The '<em><b>Oil Related Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil Related Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL_RELATED_FAILURE
     * @model name="oilRelatedFailure"
     * @generated
     * @ordered
     */
    public static final int OIL_RELATED_FAILURE_VALUE = 2;

    /**
     * The '<em><b>Poor Oil Quality</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Poor Oil Quality</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POOR_OIL_QUALITY
     * @model name="poorOilQuality"
     * @generated
     * @ordered
     */
    public static final int POOR_OIL_QUALITY_VALUE = 3;

    /**
     * An array of all the '<em><b>Transformer Failure Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TransformerFailureReasonKind[] VALUES_ARRAY = new TransformerFailureReasonKind[] {
            BUSHING_FAILURE, LOSS_OF_OIL, OIL_RELATED_FAILURE, POOR_OIL_QUALITY, };

    /**
     * A public read-only list of all the '<em><b>Transformer Failure Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< TransformerFailureReasonKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Transformer Failure Reason Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TransformerFailureReasonKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TransformerFailureReasonKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Transformer Failure Reason Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TransformerFailureReasonKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TransformerFailureReasonKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Transformer Failure Reason Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TransformerFailureReasonKind get( int value ) {
        switch( value ) {
        case BUSHING_FAILURE_VALUE:
            return BUSHING_FAILURE;
        case LOSS_OF_OIL_VALUE:
            return LOSS_OF_OIL;
        case OIL_RELATED_FAILURE_VALUE:
            return OIL_RELATED_FAILURE;
        case POOR_OIL_QUALITY_VALUE:
            return POOR_OIL_QUALITY;
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
    private TransformerFailureReasonKind( int value, String name, String literal ) {
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

} //TransformerFailureReasonKind
