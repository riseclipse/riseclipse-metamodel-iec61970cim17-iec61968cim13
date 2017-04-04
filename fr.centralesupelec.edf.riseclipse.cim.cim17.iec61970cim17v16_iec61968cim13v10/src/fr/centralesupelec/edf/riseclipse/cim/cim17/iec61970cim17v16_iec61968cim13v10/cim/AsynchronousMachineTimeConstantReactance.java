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
 * A representation of the model object '<em><b>Asynchronous Machine Time Constant Reactance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineTimeConstantReactance()
 * @model
 * @generated
 */
public interface AsynchronousMachineTimeConstantReactance extends AsynchronousMachineDynamics {
    /**
     * Returns the value of the '<em><b>Tpo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #setTpo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Tpo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineTimeConstantReactance.tpo' kind='element'"
     * @generated
     */
    Float getTpo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #getTpo()
     * @generated
     */
    void setTpo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpo()
     * @see #getTpo()
     * @see #setTpo(Float)
     * @generated
     */
    void unsetTpo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpo</em>' attribute is set.
     * @see #unsetTpo()
     * @see #getTpo()
     * @see #setTpo(Float)
     * @generated
     */
    boolean isSetTpo();

    /**
     * Returns the value of the '<em><b>Tppo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tppo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #setTppo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Tppo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineTimeConstantReactance.tppo' kind='element'"
     * @generated
     */
    Float getTppo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #getTppo()
     * @generated
     */
    void setTppo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppo()
     * @see #getTppo()
     * @see #setTppo(Float)
     * @generated
     */
    void unsetTppo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppo</em>' attribute is set.
     * @see #unsetTppo()
     * @see #getTppo()
     * @see #setTppo(Float)
     * @generated
     */
    boolean isSetTppo();

    /**
     * Returns the value of the '<em><b>Xp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #setXp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Xp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineTimeConstantReactance.xp' kind='element'"
     * @generated
     */
    Float getXp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #getXp()
     * @generated
     */
    void setXp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXp()
     * @see #getXp()
     * @see #setXp(Float)
     * @generated
     */
    void unsetXp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xp</em>' attribute is set.
     * @see #unsetXp()
     * @see #getXp()
     * @see #setXp(Float)
     * @generated
     */
    boolean isSetXp();

    /**
     * Returns the value of the '<em><b>Xpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xpp</em>' attribute.
     * @see #isSetXpp()
     * @see #unsetXpp()
     * @see #setXpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Xpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineTimeConstantReactance.xpp' kind='element'"
     * @generated
     */
    Float getXpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpp</em>' attribute.
     * @see #isSetXpp()
     * @see #unsetXpp()
     * @see #getXpp()
     * @generated
     */
    void setXpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXpp()
     * @see #getXpp()
     * @see #setXpp(Float)
     * @generated
     */
    void unsetXpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xpp</em>' attribute is set.
     * @see #unsetXpp()
     * @see #getXpp()
     * @see #setXpp(Float)
     * @generated
     */
    boolean isSetXpp();

    /**
     * Returns the value of the '<em><b>Xs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xs</em>' attribute.
     * @see #isSetXs()
     * @see #unsetXs()
     * @see #setXs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Xs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineTimeConstantReactance.xs' kind='element'"
     * @generated
     */
    Float getXs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xs</em>' attribute.
     * @see #isSetXs()
     * @see #unsetXs()
     * @see #getXs()
     * @generated
     */
    void setXs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXs()
     * @see #getXs()
     * @see #setXs(Float)
     * @generated
     */
    void unsetXs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xs</em>' attribute is set.
     * @see #unsetXs()
     * @see #getXs()
     * @see #setXs(Float)
     * @generated
     */
    boolean isSetXs();

} // AsynchronousMachineTimeConstantReactance
