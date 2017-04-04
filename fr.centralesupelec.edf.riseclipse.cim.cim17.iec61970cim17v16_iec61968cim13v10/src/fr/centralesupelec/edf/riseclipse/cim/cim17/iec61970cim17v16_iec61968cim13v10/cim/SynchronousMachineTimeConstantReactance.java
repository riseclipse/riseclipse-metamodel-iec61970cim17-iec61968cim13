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
 * A representation of the model object '<em><b>Synchronous Machine Time Constant Reactance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance()
 * @model
 * @generated
 */
public interface SynchronousMachineTimeConstantReactance extends SynchronousMachineDetailed {
    /**
     * Returns the value of the '<em><b>Ks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ks</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ks</em>' attribute.
     * @see #isSetKs()
     * @see #unsetKs()
     * @see #setKs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Ks()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.ks' kind='element'"
     * @generated
     */
    Float getKs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks</em>' attribute.
     * @see #isSetKs()
     * @see #unsetKs()
     * @see #getKs()
     * @generated
     */
    void setKs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs()
     * @see #getKs()
     * @see #setKs(Float)
     * @generated
     */
    void unsetKs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks</em>' attribute is set.
     * @see #unsetKs()
     * @see #getKs()
     * @see #setKs(Float)
     * @generated
     */
    boolean isSetKs();

    /**
     * Returns the value of the '<em><b>Model Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineModelKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineModelKind
     * @see #isSetModelType()
     * @see #unsetModelType()
     * @see #setModelType(SynchronousMachineModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_ModelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.modelType' kind='element'"
     * @generated
     */
    SynchronousMachineModelKind getModelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineModelKind
     * @see #isSetModelType()
     * @see #unsetModelType()
     * @see #getModelType()
     * @generated
     */
    void setModelType( SynchronousMachineModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelType()
     * @see #getModelType()
     * @see #setModelType(SynchronousMachineModelKind)
     * @generated
     */
    void unsetModelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Type</em>' attribute is set.
     * @see #unsetModelType()
     * @see #getModelType()
     * @see #setModelType(SynchronousMachineModelKind)
     * @generated
     */
    boolean isSetModelType();

    /**
     * Returns the value of the '<em><b>Rotor Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotorKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rotor Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotorKind
     * @see #isSetRotorType()
     * @see #unsetRotorType()
     * @see #setRotorType(RotorKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_RotorType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.rotorType' kind='element'"
     * @generated
     */
    RotorKind getRotorType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotorKind
     * @see #isSetRotorType()
     * @see #unsetRotorType()
     * @see #getRotorType()
     * @generated
     */
    void setRotorType( RotorKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotorType()
     * @see #getRotorType()
     * @see #setRotorType(RotorKind)
     * @generated
     */
    void unsetRotorType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotor Type</em>' attribute is set.
     * @see #unsetRotorType()
     * @see #getRotorType()
     * @see #setRotorType(RotorKind)
     * @generated
     */
    boolean isSetRotorType();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.tc' kind='element'"
     * @generated
     */
    Float getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #getTc()
     * @generated
     */
    void setTc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc</em>' attribute is set.
     * @see #unsetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    boolean isSetTc();

    /**
     * Returns the value of the '<em><b>Tpdo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpdo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpdo</em>' attribute.
     * @see #isSetTpdo()
     * @see #unsetTpdo()
     * @see #setTpdo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tpdo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.tpdo' kind='element'"
     * @generated
     */
    Float getTpdo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpdo</em>' attribute.
     * @see #isSetTpdo()
     * @see #unsetTpdo()
     * @see #getTpdo()
     * @generated
     */
    void setTpdo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpdo()
     * @see #getTpdo()
     * @see #setTpdo(Float)
     * @generated
     */
    void unsetTpdo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpdo</em>' attribute is set.
     * @see #unsetTpdo()
     * @see #getTpdo()
     * @see #setTpdo(Float)
     * @generated
     */
    boolean isSetTpdo();

    /**
     * Returns the value of the '<em><b>Tppdo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tppdo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tppdo</em>' attribute.
     * @see #isSetTppdo()
     * @see #unsetTppdo()
     * @see #setTppdo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tppdo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.tppdo' kind='element'"
     * @generated
     */
    Float getTppdo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppdo</em>' attribute.
     * @see #isSetTppdo()
     * @see #unsetTppdo()
     * @see #getTppdo()
     * @generated
     */
    void setTppdo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppdo()
     * @see #getTppdo()
     * @see #setTppdo(Float)
     * @generated
     */
    void unsetTppdo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppdo</em>' attribute is set.
     * @see #unsetTppdo()
     * @see #getTppdo()
     * @see #setTppdo(Float)
     * @generated
     */
    boolean isSetTppdo();

    /**
     * Returns the value of the '<em><b>Tppqo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tppqo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tppqo</em>' attribute.
     * @see #isSetTppqo()
     * @see #unsetTppqo()
     * @see #setTppqo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tppqo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.tppqo' kind='element'"
     * @generated
     */
    Float getTppqo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppqo</em>' attribute.
     * @see #isSetTppqo()
     * @see #unsetTppqo()
     * @see #getTppqo()
     * @generated
     */
    void setTppqo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppqo()
     * @see #getTppqo()
     * @see #setTppqo(Float)
     * @generated
     */
    void unsetTppqo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppqo</em>' attribute is set.
     * @see #unsetTppqo()
     * @see #getTppqo()
     * @see #setTppqo(Float)
     * @generated
     */
    boolean isSetTppqo();

    /**
     * Returns the value of the '<em><b>Tpqo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpqo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpqo</em>' attribute.
     * @see #isSetTpqo()
     * @see #unsetTpqo()
     * @see #setTpqo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tpqo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.tpqo' kind='element'"
     * @generated
     */
    Float getTpqo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpqo</em>' attribute.
     * @see #isSetTpqo()
     * @see #unsetTpqo()
     * @see #getTpqo()
     * @generated
     */
    void setTpqo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpqo()
     * @see #getTpqo()
     * @see #setTpqo(Float)
     * @generated
     */
    void unsetTpqo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpqo</em>' attribute is set.
     * @see #unsetTpqo()
     * @see #getTpqo()
     * @see #setTpqo(Float)
     * @generated
     */
    boolean isSetTpqo();

    /**
     * Returns the value of the '<em><b>XDirect Subtrans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XDirect Subtrans</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XDirect Subtrans</em>' attribute.
     * @see #isSetXDirectSubtrans()
     * @see #unsetXDirectSubtrans()
     * @see #setXDirectSubtrans(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XDirectSubtrans()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.xDirectSubtrans' kind='element'"
     * @generated
     */
    Float getXDirectSubtrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XDirect Subtrans</em>' attribute.
     * @see #isSetXDirectSubtrans()
     * @see #unsetXDirectSubtrans()
     * @see #getXDirectSubtrans()
     * @generated
     */
    void setXDirectSubtrans( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXDirectSubtrans()
     * @see #getXDirectSubtrans()
     * @see #setXDirectSubtrans(Float)
     * @generated
     */
    void unsetXDirectSubtrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XDirect Subtrans</em>' attribute is set.
     * @see #unsetXDirectSubtrans()
     * @see #getXDirectSubtrans()
     * @see #setXDirectSubtrans(Float)
     * @generated
     */
    boolean isSetXDirectSubtrans();

    /**
     * Returns the value of the '<em><b>XDirect Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XDirect Sync</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XDirect Sync</em>' attribute.
     * @see #isSetXDirectSync()
     * @see #unsetXDirectSync()
     * @see #setXDirectSync(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XDirectSync()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.xDirectSync' kind='element'"
     * @generated
     */
    Float getXDirectSync();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XDirect Sync</em>' attribute.
     * @see #isSetXDirectSync()
     * @see #unsetXDirectSync()
     * @see #getXDirectSync()
     * @generated
     */
    void setXDirectSync( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXDirectSync()
     * @see #getXDirectSync()
     * @see #setXDirectSync(Float)
     * @generated
     */
    void unsetXDirectSync();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XDirect Sync</em>' attribute is set.
     * @see #unsetXDirectSync()
     * @see #getXDirectSync()
     * @see #setXDirectSync(Float)
     * @generated
     */
    boolean isSetXDirectSync();

    /**
     * Returns the value of the '<em><b>XDirect Trans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XDirect Trans</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XDirect Trans</em>' attribute.
     * @see #isSetXDirectTrans()
     * @see #unsetXDirectTrans()
     * @see #setXDirectTrans(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XDirectTrans()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.xDirectTrans' kind='element'"
     * @generated
     */
    Float getXDirectTrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XDirect Trans</em>' attribute.
     * @see #isSetXDirectTrans()
     * @see #unsetXDirectTrans()
     * @see #getXDirectTrans()
     * @generated
     */
    void setXDirectTrans( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXDirectTrans()
     * @see #getXDirectTrans()
     * @see #setXDirectTrans(Float)
     * @generated
     */
    void unsetXDirectTrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XDirect Trans</em>' attribute is set.
     * @see #unsetXDirectTrans()
     * @see #getXDirectTrans()
     * @see #setXDirectTrans(Float)
     * @generated
     */
    boolean isSetXDirectTrans();

    /**
     * Returns the value of the '<em><b>XQuad Subtrans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XQuad Subtrans</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XQuad Subtrans</em>' attribute.
     * @see #isSetXQuadSubtrans()
     * @see #unsetXQuadSubtrans()
     * @see #setXQuadSubtrans(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XQuadSubtrans()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.xQuadSubtrans' kind='element'"
     * @generated
     */
    Float getXQuadSubtrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XQuad Subtrans</em>' attribute.
     * @see #isSetXQuadSubtrans()
     * @see #unsetXQuadSubtrans()
     * @see #getXQuadSubtrans()
     * @generated
     */
    void setXQuadSubtrans( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXQuadSubtrans()
     * @see #getXQuadSubtrans()
     * @see #setXQuadSubtrans(Float)
     * @generated
     */
    void unsetXQuadSubtrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XQuad Subtrans</em>' attribute is set.
     * @see #unsetXQuadSubtrans()
     * @see #getXQuadSubtrans()
     * @see #setXQuadSubtrans(Float)
     * @generated
     */
    boolean isSetXQuadSubtrans();

    /**
     * Returns the value of the '<em><b>XQuad Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XQuad Sync</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XQuad Sync</em>' attribute.
     * @see #isSetXQuadSync()
     * @see #unsetXQuadSync()
     * @see #setXQuadSync(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XQuadSync()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.xQuadSync' kind='element'"
     * @generated
     */
    Float getXQuadSync();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XQuad Sync</em>' attribute.
     * @see #isSetXQuadSync()
     * @see #unsetXQuadSync()
     * @see #getXQuadSync()
     * @generated
     */
    void setXQuadSync( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXQuadSync()
     * @see #getXQuadSync()
     * @see #setXQuadSync(Float)
     * @generated
     */
    void unsetXQuadSync();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XQuad Sync</em>' attribute is set.
     * @see #unsetXQuadSync()
     * @see #getXQuadSync()
     * @see #setXQuadSync(Float)
     * @generated
     */
    boolean isSetXQuadSync();

    /**
     * Returns the value of the '<em><b>XQuad Trans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XQuad Trans</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XQuad Trans</em>' attribute.
     * @see #isSetXQuadTrans()
     * @see #unsetXQuadTrans()
     * @see #setXQuadTrans(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XQuadTrans()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineTimeConstantReactance.xQuadTrans' kind='element'"
     * @generated
     */
    Float getXQuadTrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XQuad Trans</em>' attribute.
     * @see #isSetXQuadTrans()
     * @see #unsetXQuadTrans()
     * @see #getXQuadTrans()
     * @generated
     */
    void setXQuadTrans( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXQuadTrans()
     * @see #getXQuadTrans()
     * @see #setXQuadTrans(Float)
     * @generated
     */
    void unsetXQuadTrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XQuad Trans</em>' attribute is set.
     * @see #unsetXQuadTrans()
     * @see #getXQuadTrans()
     * @see #setXQuadTrans(Float)
     * @generated
     */
    boolean isSetXQuadTrans();

} // SynchronousMachineTimeConstantReactance
