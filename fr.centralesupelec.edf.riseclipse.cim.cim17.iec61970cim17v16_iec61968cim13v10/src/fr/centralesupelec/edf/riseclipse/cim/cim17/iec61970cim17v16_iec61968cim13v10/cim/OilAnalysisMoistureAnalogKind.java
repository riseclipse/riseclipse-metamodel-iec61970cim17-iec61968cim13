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
 * A representation of the literals of the enumeration '<em><b>Oil Analysis Moisture Analog Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilAnalysisMoistureAnalogKind()
 * @model
 * @generated
 */
public enum OilAnalysisMoistureAnalogKind implements Enumerator {
    /**
     * The '<em><b>Water Content</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_VALUE
     * @generated
     * @ordered
     */
    WATER_CONTENT( 0, "waterContent", "waterContent" ),

    /**
     * The '<em><b>Water Content Monitored Via Infrared</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_INFRARED_VALUE
     * @generated
     * @ordered
     */
    WATER_CONTENT_MONITORED_VIA_INFRARED( 1, "waterContentMonitoredViaInfrared", "waterContentMonitoredViaInfrared" ),

    /**
     * The '<em><b>Water Content Monitored Via Capacitance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_CAPACITANCE_VALUE
     * @generated
     * @ordered
     */
    WATER_CONTENT_MONITORED_VIA_CAPACITANCE( 2, "waterContentMonitoredViaCapacitance", "waterContentMonitoredViaCapacitance" ),

    /**
     * The '<em><b>Water Content Monitored Via Aluminum Oxide</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE_VALUE
     * @generated
     * @ordered
     */
    WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE( 3, "waterContentMonitoredViaAluminumOxide", "waterContentMonitoredViaAluminumOxide" ),

    /**
     * The '<em><b>Water Content Monitored Via Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_OTHER_VALUE
     * @generated
     * @ordered
     */
    WATER_CONTENT_MONITORED_VIA_OTHER( 4, "waterContentMonitoredViaOther", "waterContentMonitoredViaOther" ),

    /**
     * The '<em><b>Relative Saturation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELATIVE_SATURATION_VALUE
     * @generated
     * @ordered
     */
    RELATIVE_SATURATION( 5, "relativeSaturation", "relativeSaturation" ),

    /**
     * The '<em><b>Relative Saturation Calculated</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELATIVE_SATURATION_CALCULATED_VALUE
     * @generated
     * @ordered
     */
    RELATIVE_SATURATION_CALCULATED( 6, "relativeSaturationCalculated", "relativeSaturationCalculated" ),

    /**
     * The '<em><b>Dew Point</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEW_POINT_VALUE
     * @generated
     * @ordered
     */
    DEW_POINT( 7, "dewPoint", "dewPoint" );

    /**
     * The '<em><b>Water Content</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water Content</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT
     * @model name="waterContent"
     * @generated
     * @ordered
     */
    public static final int WATER_CONTENT_VALUE = 0;

    /**
     * The '<em><b>Water Content Monitored Via Infrared</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water Content Monitored Via Infrared</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_INFRARED
     * @model name="waterContentMonitoredViaInfrared"
     * @generated
     * @ordered
     */
    public static final int WATER_CONTENT_MONITORED_VIA_INFRARED_VALUE = 1;

    /**
     * The '<em><b>Water Content Monitored Via Capacitance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water Content Monitored Via Capacitance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_CAPACITANCE
     * @model name="waterContentMonitoredViaCapacitance"
     * @generated
     * @ordered
     */
    public static final int WATER_CONTENT_MONITORED_VIA_CAPACITANCE_VALUE = 2;

    /**
     * The '<em><b>Water Content Monitored Via Aluminum Oxide</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water Content Monitored Via Aluminum Oxide</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE
     * @model name="waterContentMonitoredViaAluminumOxide"
     * @generated
     * @ordered
     */
    public static final int WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE_VALUE = 3;

    /**
     * The '<em><b>Water Content Monitored Via Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water Content Monitored Via Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER_CONTENT_MONITORED_VIA_OTHER
     * @model name="waterContentMonitoredViaOther"
     * @generated
     * @ordered
     */
    public static final int WATER_CONTENT_MONITORED_VIA_OTHER_VALUE = 4;

    /**
     * The '<em><b>Relative Saturation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Relative Saturation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELATIVE_SATURATION
     * @model name="relativeSaturation"
     * @generated
     * @ordered
     */
    public static final int RELATIVE_SATURATION_VALUE = 5;

    /**
     * The '<em><b>Relative Saturation Calculated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Relative Saturation Calculated</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELATIVE_SATURATION_CALCULATED
     * @model name="relativeSaturationCalculated"
     * @generated
     * @ordered
     */
    public static final int RELATIVE_SATURATION_CALCULATED_VALUE = 6;

    /**
     * The '<em><b>Dew Point</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dew Point</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEW_POINT
     * @model name="dewPoint"
     * @generated
     * @ordered
     */
    public static final int DEW_POINT_VALUE = 7;

    /**
     * An array of all the '<em><b>Oil Analysis Moisture Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OilAnalysisMoistureAnalogKind[] VALUES_ARRAY = new OilAnalysisMoistureAnalogKind[] {
            WATER_CONTENT, WATER_CONTENT_MONITORED_VIA_INFRARED, WATER_CONTENT_MONITORED_VIA_CAPACITANCE,
            WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE, WATER_CONTENT_MONITORED_VIA_OTHER, RELATIVE_SATURATION,
            RELATIVE_SATURATION_CALCULATED, DEW_POINT, };

    /**
     * A public read-only list of all the '<em><b>Oil Analysis Moisture Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OilAnalysisMoistureAnalogKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Oil Analysis Moisture Analog Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisMoistureAnalogKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisMoistureAnalogKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Moisture Analog Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisMoistureAnalogKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisMoistureAnalogKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Moisture Analog Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisMoistureAnalogKind get( int value ) {
        switch( value ) {
        case WATER_CONTENT_VALUE:
            return WATER_CONTENT;
        case WATER_CONTENT_MONITORED_VIA_INFRARED_VALUE:
            return WATER_CONTENT_MONITORED_VIA_INFRARED;
        case WATER_CONTENT_MONITORED_VIA_CAPACITANCE_VALUE:
            return WATER_CONTENT_MONITORED_VIA_CAPACITANCE;
        case WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE_VALUE:
            return WATER_CONTENT_MONITORED_VIA_ALUMINUM_OXIDE;
        case WATER_CONTENT_MONITORED_VIA_OTHER_VALUE:
            return WATER_CONTENT_MONITORED_VIA_OTHER;
        case RELATIVE_SATURATION_VALUE:
            return RELATIVE_SATURATION;
        case RELATIVE_SATURATION_CALCULATED_VALUE:
            return RELATIVE_SATURATION_CALCULATED;
        case DEW_POINT_VALUE:
            return DEW_POINT;
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
    private OilAnalysisMoistureAnalogKind( int value, String name, String literal ) {
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

} //OilAnalysisMoistureAnalogKind
