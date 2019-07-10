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
 * A representation of the literals of the enumeration '<em><b>Com Technology Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComTechnologyKind()
 * @model
 * @generated
 */
public enum ComTechnologyKind implements Enumerator {
    /**
     * The '<em><b>Cellular</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CELLULAR_VALUE
     * @generated
     * @ordered
     */
    CELLULAR( 0, "cellular", "cellular" ),

    /**
     * The '<em><b>Ethernet</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ETHERNET_VALUE
     * @generated
     * @ordered
     */
    ETHERNET( 1, "ethernet", "ethernet" ),

    /**
     * The '<em><b>Home Plug</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOME_PLUG_VALUE
     * @generated
     * @ordered
     */
    HOME_PLUG( 2, "homePlug", "homePlug" ),

    /**
     * The '<em><b>Pager</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PAGER_VALUE
     * @generated
     * @ordered
     */
    PAGER( 3, "pager", "pager" ),

    /**
     * The '<em><b>Phone</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PHONE_VALUE
     * @generated
     * @ordered
     */
    PHONE( 4, "phone", "phone" ),

    /**
     * The '<em><b>Plc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLC_VALUE
     * @generated
     * @ordered
     */
    PLC( 5, "plc", "plc" ),

    /**
     * The '<em><b>Rf</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RF_VALUE
     * @generated
     * @ordered
     */
    RF( 6, "rf", "rf" ),

    /**
     * The '<em><b>Rf Mesh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RF_MESH_VALUE
     * @generated
     * @ordered
     */
    RF_MESH( 7, "rfMesh", "rfMesh" ),

    /**
     * The '<em><b>Zigbee</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZIGBEE_VALUE
     * @generated
     * @ordered
     */
    ZIGBEE( 8, "zigbee", "zigbee" );

    /**
     * The '<em><b>Cellular</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cellular</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CELLULAR
     * @model name="cellular"
     * @generated
     * @ordered
     */
    public static final int CELLULAR_VALUE = 0;

    /**
     * The '<em><b>Ethernet</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ethernet</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ETHERNET
     * @model name="ethernet"
     * @generated
     * @ordered
     */
    public static final int ETHERNET_VALUE = 1;

    /**
     * The '<em><b>Home Plug</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Home Plug</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HOME_PLUG
     * @model name="homePlug"
     * @generated
     * @ordered
     */
    public static final int HOME_PLUG_VALUE = 2;

    /**
     * The '<em><b>Pager</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pager</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PAGER
     * @model name="pager"
     * @generated
     * @ordered
     */
    public static final int PAGER_VALUE = 3;

    /**
     * The '<em><b>Phone</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Phone</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PHONE
     * @model name="phone"
     * @generated
     * @ordered
     */
    public static final int PHONE_VALUE = 4;

    /**
     * The '<em><b>Plc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Plc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PLC
     * @model name="plc"
     * @generated
     * @ordered
     */
    public static final int PLC_VALUE = 5;

    /**
     * The '<em><b>Rf</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rf</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RF
     * @model name="rf"
     * @generated
     * @ordered
     */
    public static final int RF_VALUE = 6;

    /**
     * The '<em><b>Rf Mesh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rf Mesh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RF_MESH
     * @model name="rfMesh"
     * @generated
     * @ordered
     */
    public static final int RF_MESH_VALUE = 7;

    /**
     * The '<em><b>Zigbee</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zigbee</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZIGBEE
     * @model name="zigbee"
     * @generated
     * @ordered
     */
    public static final int ZIGBEE_VALUE = 8;

    /**
     * An array of all the '<em><b>Com Technology Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ComTechnologyKind[] VALUES_ARRAY = new ComTechnologyKind[] { CELLULAR, ETHERNET, HOME_PLUG,
            PAGER, PHONE, PLC, RF, RF_MESH, ZIGBEE, };

    /**
     * A public read-only list of all the '<em><b>Com Technology Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ComTechnologyKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Com Technology Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ComTechnologyKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ComTechnologyKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Com Technology Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ComTechnologyKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ComTechnologyKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Com Technology Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ComTechnologyKind get( int value ) {
        switch( value ) {
        case CELLULAR_VALUE:
            return CELLULAR;
        case ETHERNET_VALUE:
            return ETHERNET;
        case HOME_PLUG_VALUE:
            return HOME_PLUG;
        case PAGER_VALUE:
            return PAGER;
        case PHONE_VALUE:
            return PHONE;
        case PLC_VALUE:
            return PLC;
        case RF_VALUE:
            return RF;
        case RF_MESH_VALUE:
            return RF_MESH;
        case ZIGBEE_VALUE:
            return ZIGBEE;
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
    private ComTechnologyKind( int value, String name, String literal ) {
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

} //ComTechnologyKind
