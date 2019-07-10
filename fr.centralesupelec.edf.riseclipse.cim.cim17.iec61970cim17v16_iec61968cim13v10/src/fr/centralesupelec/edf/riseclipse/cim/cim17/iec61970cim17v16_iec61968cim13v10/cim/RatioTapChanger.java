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
 * A representation of the model object '<em><b>Ratio Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChanger()
 * @model
 * @generated
 */
public interface RatioTapChanger extends TapChanger {
    /**
     * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Step Voltage Increment</em>' attribute.
     * @see #isSetStepVoltageIncrement()
     * @see #unsetStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChanger_StepVoltageIncrement()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RatioTapChanger.stepVoltageIncrement' kind='element'"
     * @generated
     */
    Float getStepVoltageIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
     * @see #isSetStepVoltageIncrement()
     * @see #unsetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @generated
     */
    void setStepVoltageIncrement( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Float)
     * @generated
     */
    void unsetStepVoltageIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step Voltage Increment</em>' attribute is set.
     * @see #unsetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Float)
     * @generated
     */
    boolean isSetStepVoltageIncrement();

    /**
     * Returns the value of the '<em><b>Tcul Control Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerControlMode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tcul Control Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tcul Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerControlMode
     * @see #isSetTculControlMode()
     * @see #unsetTculControlMode()
     * @see #setTculControlMode(TransformerControlMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChanger_TculControlMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RatioTapChanger.tculControlMode' kind='element'"
     * @generated
     */
    TransformerControlMode getTculControlMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcul Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerControlMode
     * @see #isSetTculControlMode()
     * @see #unsetTculControlMode()
     * @see #getTculControlMode()
     * @generated
     */
    void setTculControlMode( TransformerControlMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTculControlMode()
     * @see #getTculControlMode()
     * @see #setTculControlMode(TransformerControlMode)
     * @generated
     */
    void unsetTculControlMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tcul Control Mode</em>' attribute is set.
     * @see #unsetTculControlMode()
     * @see #getTculControlMode()
     * @see #setTculControlMode(TransformerControlMode)
     * @generated
     */
    boolean isSetTculControlMode();

    /**
     * Returns the value of the '<em><b>Transformer End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChanger_TransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getRatioTapChanger
     * @model opposite="RatioTapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RatioTapChanger.TransformerEnd' kind='element'"
     * @generated
     */
    TransformerEnd getTransformerEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @generated
     */
    void setTransformerEnd( TransformerEnd value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    void unsetTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer End</em>' reference is set.
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    boolean isSetTransformerEnd();

    /**
     * Returns the value of the '<em><b>Ratio Tap Changer Table</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTable#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ratio Tap Changer Table</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ratio Tap Changer Table</em>' reference.
     * @see #isSetRatioTapChangerTable()
     * @see #unsetRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRatioTapChanger_RatioTapChangerTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTable#getRatioTapChanger
     * @model opposite="RatioTapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RatioTapChanger.RatioTapChangerTable' kind='element'"
     * @generated
     */
    RatioTapChangerTable getRatioTapChangerTable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ratio Tap Changer Table</em>' reference.
     * @see #isSetRatioTapChangerTable()
     * @see #unsetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @generated
     */
    void setRatioTapChangerTable( RatioTapChangerTable value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @generated
     */
    void unsetRatioTapChangerTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer Table</em>' reference is set.
     * @see #unsetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @generated
     */
    boolean isSetRatioTapChangerTable();

} // RatioTapChanger
