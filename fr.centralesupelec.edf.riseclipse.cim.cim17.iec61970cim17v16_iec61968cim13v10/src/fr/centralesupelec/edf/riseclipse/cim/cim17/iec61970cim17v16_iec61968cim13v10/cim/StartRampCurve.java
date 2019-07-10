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
 * A representation of the model object '<em><b>Start Ramp Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartRampCurve()
 * @model
 * @generated
 */
public interface StartRampCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Hot Standby Ramp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hot Standby Ramp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hot Standby Ramp</em>' attribute.
     * @see #isSetHotStandbyRamp()
     * @see #unsetHotStandbyRamp()
     * @see #setHotStandbyRamp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartRampCurve_HotStandbyRamp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartRampCurve.hotStandbyRamp' kind='element'"
     * @generated
     */
    Float getHotStandbyRamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hot Standby Ramp</em>' attribute.
     * @see #isSetHotStandbyRamp()
     * @see #unsetHotStandbyRamp()
     * @see #getHotStandbyRamp()
     * @generated
     */
    void setHotStandbyRamp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHotStandbyRamp()
     * @see #getHotStandbyRamp()
     * @see #setHotStandbyRamp(Float)
     * @generated
     */
    void unsetHotStandbyRamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hot Standby Ramp</em>' attribute is set.
     * @see #unsetHotStandbyRamp()
     * @see #getHotStandbyRamp()
     * @see #setHotStandbyRamp(Float)
     * @generated
     */
    boolean isSetHotStandbyRamp();

    /**
     * Returns the value of the '<em><b>Startup Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Model</em>' reference.
     * @see #isSetStartupModel()
     * @see #unsetStartupModel()
     * @see #setStartupModel(StartupModel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartRampCurve_StartupModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartRampCurve
     * @model opposite="StartRampCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartRampCurve.StartupModel' kind='element'"
     * @generated
     */
    StartupModel getStartupModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Model</em>' reference.
     * @see #isSetStartupModel()
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @generated
     */
    void setStartupModel( StartupModel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    void unsetStartupModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getStartupModel <em>Startup Model</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Model</em>' reference is set.
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    boolean isSetStartupModel();

} // StartRampCurve
