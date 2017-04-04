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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Length DC Line Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getResistance <em>Resistance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getDCLineSegments <em>DC Line Segments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthDCLineParameter()
 * @model
 * @generated
 */
public interface PerLengthDCLineParameter extends PerLengthLineParameter {
    /**
     * Returns the value of the '<em><b>Capacitance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacitance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #setCapacitance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthDCLineParameter_Capacitance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthDCLineParameter.capacitance' kind='element'"
     * @generated
     */
    Float getCapacitance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #getCapacitance()
     * @generated
     */
    void setCapacitance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Float)
     * @generated
     */
    void unsetCapacitance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getCapacitance <em>Capacitance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capacitance</em>' attribute is set.
     * @see #unsetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Float)
     * @generated
     */
    boolean isSetCapacitance();

    /**
     * Returns the value of the '<em><b>Inductance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inductance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inductance</em>' attribute.
     * @see #isSetInductance()
     * @see #unsetInductance()
     * @see #setInductance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthDCLineParameter_Inductance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthDCLineParameter.inductance' kind='element'"
     * @generated
     */
    Float getInductance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getInductance <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inductance</em>' attribute.
     * @see #isSetInductance()
     * @see #unsetInductance()
     * @see #getInductance()
     * @generated
     */
    void setInductance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getInductance <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInductance()
     * @see #getInductance()
     * @see #setInductance(Float)
     * @generated
     */
    void unsetInductance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getInductance <em>Inductance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inductance</em>' attribute is set.
     * @see #unsetInductance()
     * @see #getInductance()
     * @see #setInductance(Float)
     * @generated
     */
    boolean isSetInductance();

    /**
     * Returns the value of the '<em><b>Resistance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resistance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #setResistance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthDCLineParameter_Resistance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthDCLineParameter.resistance' kind='element'"
     * @generated
     */
    Float getResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #getResistance()
     * @generated
     */
    void setResistance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResistance()
     * @see #getResistance()
     * @see #setResistance(Float)
     * @generated
     */
    void unsetResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getResistance <em>Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resistance</em>' attribute is set.
     * @see #unsetResistance()
     * @see #getResistance()
     * @see #setResistance(Float)
     * @generated
     */
    boolean isSetResistance();

    /**
     * Returns the value of the '<em><b>DC Line Segments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCLineSegment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCLineSegment#getPerLengthParameter <em>Per Length Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Line Segments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Line Segments</em>' reference list.
     * @see #isSetDCLineSegments()
     * @see #unsetDCLineSegments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthDCLineParameter_DCLineSegments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCLineSegment#getPerLengthParameter
     * @model opposite="PerLengthParameter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthDCLineParameter.DCLineSegments' kind='element'"
     * @generated
     */
    EList< DCLineSegment > getDCLineSegments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getDCLineSegments <em>DC Line Segments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCLineSegments()
     * @see #getDCLineSegments()
     * @generated
     */
    void unsetDCLineSegments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter#getDCLineSegments <em>DC Line Segments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Line Segments</em>' reference list is set.
     * @see #unsetDCLineSegments()
     * @see #getDCLineSegments()
     * @generated
     */
    boolean isSetDCLineSegments();

} // PerLengthDCLineParameter
