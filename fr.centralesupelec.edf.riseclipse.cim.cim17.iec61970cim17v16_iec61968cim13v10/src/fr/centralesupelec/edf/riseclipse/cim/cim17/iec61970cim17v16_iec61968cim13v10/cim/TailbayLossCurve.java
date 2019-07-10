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
 * A representation of the model object '<em><b>Tailbay Loss Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTailbayLossCurve()
 * @model
 * @generated
 */
public interface TailbayLossCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Hydro Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Generating Unit</em>' reference.
     * @see #isSetHydroGeneratingUnit()
     * @see #unsetHydroGeneratingUnit()
     * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTailbayLossCurve_HydroGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getTailbayLossCurve
     * @model opposite="TailbayLossCurve" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TailbayLossCurve.HydroGeneratingUnit' kind='element'"
     * @generated
     */
    HydroGeneratingUnit getHydroGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Generating Unit</em>' reference.
     * @see #isSetHydroGeneratingUnit()
     * @see #unsetHydroGeneratingUnit()
     * @see #getHydroGeneratingUnit()
     * @generated
     */
    void setHydroGeneratingUnit( HydroGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroGeneratingUnit()
     * @see #getHydroGeneratingUnit()
     * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
     * @generated
     */
    void unsetHydroGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Generating Unit</em>' reference is set.
     * @see #unsetHydroGeneratingUnit()
     * @see #getHydroGeneratingUnit()
     * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
     * @generated
     */
    boolean isSetHydroGeneratingUnit();

} // TailbayLossCurve
