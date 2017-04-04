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
 * A representation of the model object '<em><b>Vs Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsCapabilityCurve()
 * @model
 * @generated
 */
public interface VsCapabilityCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Vs Converter DC Sides</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vs Converter DC Sides</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vs Converter DC Sides</em>' reference list.
     * @see #isSetVsConverterDCSides()
     * @see #unsetVsConverterDCSides()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsCapabilityCurve_VsConverterDCSides()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getCapabilityCurve
     * @model opposite="CapabilityCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsCapabilityCurve.VsConverterDCSides' kind='element'"
     * @generated
     */
    EList< VsConverter > getVsConverterDCSides();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsConverterDCSides()
     * @see #getVsConverterDCSides()
     * @generated
     */
    void unsetVsConverterDCSides();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vs Converter DC Sides</em>' reference list is set.
     * @see #unsetVsConverterDCSides()
     * @see #getVsConverterDCSides()
     * @generated
     */
    boolean isSetVsConverterDCSides();

} // VsCapabilityCurve
