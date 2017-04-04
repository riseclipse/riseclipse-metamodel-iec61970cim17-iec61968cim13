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
 * A representation of the literals of the enumeration '<em><b>Oil Analysis PCB Analog Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilAnalysisPCBAnalogKind()
 * @model
 * @generated
 */
public enum OilAnalysisPCBAnalogKind implements Enumerator {
    /**
     * The '<em><b>Aroclor1221</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AROCLOR1221_VALUE
     * @generated
     * @ordered
     */
    AROCLOR1221( 0, "aroclor1221", "aroclor1221" ),

    /**
     * The '<em><b>Aroclor1242</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AROCLOR1242_VALUE
     * @generated
     * @ordered
     */
    AROCLOR1242( 1, "aroclor1242", "aroclor1242" ),

    /**
     * The '<em><b>Aroclor1254</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AROCLOR1254_VALUE
     * @generated
     * @ordered
     */
    AROCLOR1254( 2, "aroclor1254", "aroclor1254" ),

    /**
     * The '<em><b>Aroclor1260</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AROCLOR1260_VALUE
     * @generated
     * @ordered
     */
    AROCLOR1260( 3, "aroclor1260", "aroclor1260" ),

    /**
     * The '<em><b>Aroclor1016</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AROCLOR1016_VALUE
     * @generated
     * @ordered
     */
    AROCLOR1016( 4, "aroclor1016", "aroclor1016" ),

    /**
     * The '<em><b>Total PCB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_PCB_VALUE
     * @generated
     * @ordered
     */
    TOTAL_PCB( 5, "totalPCB", "totalPCB" );

    /**
     * The '<em><b>Aroclor1221</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aroclor1221</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AROCLOR1221
     * @model name="aroclor1221"
     * @generated
     * @ordered
     */
    public static final int AROCLOR1221_VALUE = 0;

    /**
     * The '<em><b>Aroclor1242</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aroclor1242</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AROCLOR1242
     * @model name="aroclor1242"
     * @generated
     * @ordered
     */
    public static final int AROCLOR1242_VALUE = 1;

    /**
     * The '<em><b>Aroclor1254</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aroclor1254</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AROCLOR1254
     * @model name="aroclor1254"
     * @generated
     * @ordered
     */
    public static final int AROCLOR1254_VALUE = 2;

    /**
     * The '<em><b>Aroclor1260</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aroclor1260</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AROCLOR1260
     * @model name="aroclor1260"
     * @generated
     * @ordered
     */
    public static final int AROCLOR1260_VALUE = 3;

    /**
     * The '<em><b>Aroclor1016</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aroclor1016</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AROCLOR1016
     * @model name="aroclor1016"
     * @generated
     * @ordered
     */
    public static final int AROCLOR1016_VALUE = 4;

    /**
     * The '<em><b>Total PCB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total PCB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_PCB
     * @model name="totalPCB"
     * @generated
     * @ordered
     */
    public static final int TOTAL_PCB_VALUE = 5;

    /**
     * An array of all the '<em><b>Oil Analysis PCB Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OilAnalysisPCBAnalogKind[] VALUES_ARRAY = new OilAnalysisPCBAnalogKind[] { AROCLOR1221,
            AROCLOR1242, AROCLOR1254, AROCLOR1260, AROCLOR1016, TOTAL_PCB, };

    /**
     * A public read-only list of all the '<em><b>Oil Analysis PCB Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OilAnalysisPCBAnalogKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Oil Analysis PCB Analog Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisPCBAnalogKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisPCBAnalogKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis PCB Analog Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisPCBAnalogKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisPCBAnalogKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis PCB Analog Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisPCBAnalogKind get( int value ) {
        switch( value ) {
        case AROCLOR1221_VALUE:
            return AROCLOR1221;
        case AROCLOR1242_VALUE:
            return AROCLOR1242;
        case AROCLOR1254_VALUE:
            return AROCLOR1254;
        case AROCLOR1260_VALUE:
            return AROCLOR1260;
        case AROCLOR1016_VALUE:
            return AROCLOR1016;
        case TOTAL_PCB_VALUE:
            return TOTAL_PCB;
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
    private OilAnalysisPCBAnalogKind( int value, String name, String literal ) {
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

} //OilAnalysisPCBAnalogKind
