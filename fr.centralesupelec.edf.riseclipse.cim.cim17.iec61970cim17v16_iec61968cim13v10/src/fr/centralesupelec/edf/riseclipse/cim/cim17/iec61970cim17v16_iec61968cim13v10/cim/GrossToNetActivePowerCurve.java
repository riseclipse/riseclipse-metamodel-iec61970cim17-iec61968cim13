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
 * A representation of the model object '<em><b>Gross To Net Active Power Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGrossToNetActivePowerCurve()
 * @model
 * @generated
 */
public interface GrossToNetActivePowerCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGrossToNetActivePowerCurve_GeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGrossToNetActivePowerCurves
     * @model opposite="GrossToNetActivePowerCurves" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GrossToNetActivePowerCurve.GeneratingUnit' kind='element'"
     * @generated
     */
    GeneratingUnit getGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @generated
     */
    void setGeneratingUnit( GeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    void unsetGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generating Unit</em>' reference is set.
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    boolean isSetGeneratingUnit();

} // GrossToNetActivePowerCurve
