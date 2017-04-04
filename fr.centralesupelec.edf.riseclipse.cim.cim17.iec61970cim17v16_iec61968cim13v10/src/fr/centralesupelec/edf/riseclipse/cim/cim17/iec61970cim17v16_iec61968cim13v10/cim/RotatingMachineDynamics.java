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
 * A representation of the model object '<em><b>Rotating Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics()
 * @model
 * @generated
 */
public interface RotatingMachineDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Damping</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Damping</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Damping</em>' attribute.
     * @see #isSetDamping()
     * @see #unsetDamping()
     * @see #setDamping(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics_Damping()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RotatingMachineDynamics.damping' kind='element'"
     * @generated
     */
    Float getDamping();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damping</em>' attribute.
     * @see #isSetDamping()
     * @see #unsetDamping()
     * @see #getDamping()
     * @generated
     */
    void setDamping( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDamping()
     * @see #getDamping()
     * @see #setDamping(Float)
     * @generated
     */
    void unsetDamping();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Damping</em>' attribute is set.
     * @see #unsetDamping()
     * @see #getDamping()
     * @see #setDamping(Float)
     * @generated
     */
    boolean isSetDamping();

    /**
     * Returns the value of the '<em><b>Inertia</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inertia</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inertia</em>' attribute.
     * @see #isSetInertia()
     * @see #unsetInertia()
     * @see #setInertia(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics_Inertia()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RotatingMachineDynamics.inertia' kind='element'"
     * @generated
     */
    Float getInertia();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inertia</em>' attribute.
     * @see #isSetInertia()
     * @see #unsetInertia()
     * @see #getInertia()
     * @generated
     */
    void setInertia( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInertia()
     * @see #getInertia()
     * @see #setInertia(Float)
     * @generated
     */
    void unsetInertia();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inertia</em>' attribute is set.
     * @see #unsetInertia()
     * @see #getInertia()
     * @see #setInertia(Float)
     * @generated
     */
    boolean isSetInertia();

    /**
     * Returns the value of the '<em><b>Saturation Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Saturation Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Saturation Factor</em>' attribute.
     * @see #isSetSaturationFactor()
     * @see #unsetSaturationFactor()
     * @see #setSaturationFactor(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics_SaturationFactor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RotatingMachineDynamics.saturationFactor' kind='element'"
     * @generated
     */
    Float getSaturationFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor</em>' attribute.
     * @see #isSetSaturationFactor()
     * @see #unsetSaturationFactor()
     * @see #getSaturationFactor()
     * @generated
     */
    void setSaturationFactor( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactor()
     * @see #getSaturationFactor()
     * @see #setSaturationFactor(Float)
     * @generated
     */
    void unsetSaturationFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor</em>' attribute is set.
     * @see #unsetSaturationFactor()
     * @see #getSaturationFactor()
     * @see #setSaturationFactor(Float)
     * @generated
     */
    boolean isSetSaturationFactor();

    /**
     * Returns the value of the '<em><b>Saturation Factor120</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Saturation Factor120</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Saturation Factor120</em>' attribute.
     * @see #isSetSaturationFactor120()
     * @see #unsetSaturationFactor120()
     * @see #setSaturationFactor120(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics_SaturationFactor120()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RotatingMachineDynamics.saturationFactor120' kind='element'"
     * @generated
     */
    Float getSaturationFactor120();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor120</em>' attribute.
     * @see #isSetSaturationFactor120()
     * @see #unsetSaturationFactor120()
     * @see #getSaturationFactor120()
     * @generated
     */
    void setSaturationFactor120( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactor120()
     * @see #getSaturationFactor120()
     * @see #setSaturationFactor120(Float)
     * @generated
     */
    void unsetSaturationFactor120();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor120</em>' attribute is set.
     * @see #unsetSaturationFactor120()
     * @see #getSaturationFactor120()
     * @see #setSaturationFactor120(Float)
     * @generated
     */
    boolean isSetSaturationFactor120();

    /**
     * Returns the value of the '<em><b>Stator Leakage Reactance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stator Leakage Reactance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stator Leakage Reactance</em>' attribute.
     * @see #isSetStatorLeakageReactance()
     * @see #unsetStatorLeakageReactance()
     * @see #setStatorLeakageReactance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics_StatorLeakageReactance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RotatingMachineDynamics.statorLeakageReactance' kind='element'"
     * @generated
     */
    Float getStatorLeakageReactance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stator Leakage Reactance</em>' attribute.
     * @see #isSetStatorLeakageReactance()
     * @see #unsetStatorLeakageReactance()
     * @see #getStatorLeakageReactance()
     * @generated
     */
    void setStatorLeakageReactance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatorLeakageReactance()
     * @see #getStatorLeakageReactance()
     * @see #setStatorLeakageReactance(Float)
     * @generated
     */
    void unsetStatorLeakageReactance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stator Leakage Reactance</em>' attribute is set.
     * @see #unsetStatorLeakageReactance()
     * @see #getStatorLeakageReactance()
     * @see #setStatorLeakageReactance(Float)
     * @generated
     */
    boolean isSetStatorLeakageReactance();

    /**
     * Returns the value of the '<em><b>Stator Resistance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stator Resistance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stator Resistance</em>' attribute.
     * @see #isSetStatorResistance()
     * @see #unsetStatorResistance()
     * @see #setStatorResistance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRotatingMachineDynamics_StatorResistance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RotatingMachineDynamics.statorResistance' kind='element'"
     * @generated
     */
    Float getStatorResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stator Resistance</em>' attribute.
     * @see #isSetStatorResistance()
     * @see #unsetStatorResistance()
     * @see #getStatorResistance()
     * @generated
     */
    void setStatorResistance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatorResistance()
     * @see #getStatorResistance()
     * @see #setStatorResistance(Float)
     * @generated
     */
    void unsetStatorResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stator Resistance</em>' attribute is set.
     * @see #unsetStatorResistance()
     * @see #getStatorResistance()
     * @see #setStatorResistance(Float)
     * @generated
     */
    boolean isSetStatorResistance();

} // RotatingMachineDynamics
