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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerLinear()
 * @model
 * @generated
 */
public interface PhaseTapChangerLinear extends PhaseTapChanger {
    /**
     * Returns the value of the '<em><b>Step Phase Shift Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step Phase Shift Increment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Step Phase Shift Increment</em>' attribute.
     * @see #isSetStepPhaseShiftIncrement()
     * @see #unsetStepPhaseShiftIncrement()
     * @see #setStepPhaseShiftIncrement(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerLinear_StepPhaseShiftIncrement()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PhaseTapChangerLinear.stepPhaseShiftIncrement' kind='element'"
     * @generated
     */
    Float getStepPhaseShiftIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step Phase Shift Increment</em>' attribute.
     * @see #isSetStepPhaseShiftIncrement()
     * @see #unsetStepPhaseShiftIncrement()
     * @see #getStepPhaseShiftIncrement()
     * @generated
     */
    void setStepPhaseShiftIncrement( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepPhaseShiftIncrement()
     * @see #getStepPhaseShiftIncrement()
     * @see #setStepPhaseShiftIncrement(Float)
     * @generated
     */
    void unsetStepPhaseShiftIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step Phase Shift Increment</em>' attribute is set.
     * @see #unsetStepPhaseShiftIncrement()
     * @see #getStepPhaseShiftIncrement()
     * @see #setStepPhaseShiftIncrement(Float)
     * @generated
     */
    boolean isSetStepPhaseShiftIncrement();

    /**
     * Returns the value of the '<em><b>XMax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMax</em>' attribute.
     * @see #isSetXMax()
     * @see #unsetXMax()
     * @see #setXMax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerLinear_XMax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PhaseTapChangerLinear.xMax' kind='element'"
     * @generated
     */
    Float getXMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMax</em>' attribute.
     * @see #isSetXMax()
     * @see #unsetXMax()
     * @see #getXMax()
     * @generated
     */
    void setXMax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMax()
     * @see #getXMax()
     * @see #setXMax(Float)
     * @generated
     */
    void unsetXMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMax</em>' attribute is set.
     * @see #unsetXMax()
     * @see #getXMax()
     * @see #setXMax(Float)
     * @generated
     */
    boolean isSetXMax();

    /**
     * Returns the value of the '<em><b>XMin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMin</em>' attribute.
     * @see #isSetXMin()
     * @see #unsetXMin()
     * @see #setXMin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerLinear_XMin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PhaseTapChangerLinear.xMin' kind='element'"
     * @generated
     */
    Float getXMin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMin</em>' attribute.
     * @see #isSetXMin()
     * @see #unsetXMin()
     * @see #getXMin()
     * @generated
     */
    void setXMin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMin()
     * @see #getXMin()
     * @see #setXMin(Float)
     * @generated
     */
    void unsetXMin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMin</em>' attribute is set.
     * @see #unsetXMin()
     * @see #getXMin()
     * @see #setXMin(Float)
     * @generated
     */
    boolean isSetXMin();

} // PhaseTapChangerLinear
