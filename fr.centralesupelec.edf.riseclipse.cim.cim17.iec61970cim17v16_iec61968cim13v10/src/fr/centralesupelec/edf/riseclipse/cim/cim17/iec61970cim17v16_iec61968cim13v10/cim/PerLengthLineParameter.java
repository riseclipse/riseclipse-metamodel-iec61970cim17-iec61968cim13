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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Length Line Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthLineParameter#getWireAssemblyInfo <em>Wire Assembly Info</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthLineParameter()
 * @model
 * @generated
 */
public interface PerLengthLineParameter extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wire Assembly Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo#getPerLengthLineParameter <em>Per Length Line Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Assembly Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Assembly Info</em>' reference.
     * @see #isSetWireAssemblyInfo()
     * @see #unsetWireAssemblyInfo()
     * @see #setWireAssemblyInfo(WireAssemblyInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthLineParameter_WireAssemblyInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo#getPerLengthLineParameter
     * @model opposite="PerLengthLineParameter" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthLineParameter.WireAssemblyInfo' kind='element'"
     * @generated
     */
    WireAssemblyInfo getWireAssemblyInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthLineParameter#getWireAssemblyInfo <em>Wire Assembly Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Assembly Info</em>' reference.
     * @see #isSetWireAssemblyInfo()
     * @see #unsetWireAssemblyInfo()
     * @see #getWireAssemblyInfo()
     * @generated
     */
    void setWireAssemblyInfo( WireAssemblyInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthLineParameter#getWireAssemblyInfo <em>Wire Assembly Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireAssemblyInfo()
     * @see #getWireAssemblyInfo()
     * @see #setWireAssemblyInfo(WireAssemblyInfo)
     * @generated
     */
    void unsetWireAssemblyInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthLineParameter#getWireAssemblyInfo <em>Wire Assembly Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Assembly Info</em>' reference is set.
     * @see #unsetWireAssemblyInfo()
     * @see #getWireAssemblyInfo()
     * @see #setWireAssemblyInfo(WireAssemblyInfo)
     * @generated
     */
    boolean isSetWireAssemblyInfo();

} // PerLengthLineParameter
