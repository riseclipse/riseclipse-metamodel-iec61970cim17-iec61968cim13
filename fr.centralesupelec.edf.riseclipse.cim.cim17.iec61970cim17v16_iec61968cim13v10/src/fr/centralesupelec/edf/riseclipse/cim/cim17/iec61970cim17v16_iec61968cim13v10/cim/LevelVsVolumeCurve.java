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
 * A representation of the model object '<em><b>Level Vs Volume Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLevelVsVolumeCurve()
 * @model
 * @generated
 */
public interface LevelVsVolumeCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Reservoir</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reservoir</em>' reference.
     * @see #isSetReservoir()
     * @see #unsetReservoir()
     * @see #setReservoir(Reservoir)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLevelVsVolumeCurve_Reservoir()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getLevelVsVolumeCurves
     * @model opposite="LevelVsVolumeCurves" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LevelVsVolumeCurve.Reservoir' kind='element'"
     * @generated
     */
    Reservoir getReservoir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reservoir</em>' reference.
     * @see #isSetReservoir()
     * @see #unsetReservoir()
     * @see #getReservoir()
     * @generated
     */
    void setReservoir( Reservoir value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReservoir()
     * @see #getReservoir()
     * @see #setReservoir(Reservoir)
     * @generated
     */
    void unsetReservoir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reservoir</em>' reference is set.
     * @see #unsetReservoir()
     * @see #getReservoir()
     * @see #setReservoir(Reservoir)
     * @generated
     */
    boolean isSetReservoir();

} // LevelVsVolumeCurve
