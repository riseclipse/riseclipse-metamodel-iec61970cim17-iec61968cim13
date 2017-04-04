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
 * A representation of the model object '<em><b>Gen ICompensation For Gen J</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenICompensationForGenJ()
 * @model
 * @generated
 */
public interface GenICompensationForGenJ extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Rcij</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rcij</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rcij</em>' attribute.
     * @see #isSetRcij()
     * @see #unsetRcij()
     * @see #setRcij(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenICompensationForGenJ_Rcij()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenICompensationForGenJ.rcij' kind='element'"
     * @generated
     */
    Float getRcij();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rcij</em>' attribute.
     * @see #isSetRcij()
     * @see #unsetRcij()
     * @see #getRcij()
     * @generated
     */
    void setRcij( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRcij()
     * @see #getRcij()
     * @see #setRcij(Float)
     * @generated
     */
    void unsetRcij();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rcij</em>' attribute is set.
     * @see #unsetRcij()
     * @see #getRcij()
     * @see #setRcij(Float)
     * @generated
     */
    boolean isSetRcij();

    /**
     * Returns the value of the '<em><b>Xcij</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xcij</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xcij</em>' attribute.
     * @see #isSetXcij()
     * @see #unsetXcij()
     * @see #setXcij(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenICompensationForGenJ_Xcij()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenICompensationForGenJ.xcij' kind='element'"
     * @generated
     */
    Float getXcij();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xcij</em>' attribute.
     * @see #isSetXcij()
     * @see #unsetXcij()
     * @see #getXcij()
     * @generated
     */
    void setXcij( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXcij()
     * @see #getXcij()
     * @see #setXcij(Float)
     * @generated
     */
    void unsetXcij();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xcij</em>' attribute is set.
     * @see #unsetXcij()
     * @see #getXcij()
     * @see #setXcij(Float)
     * @generated
     */
    boolean isSetXcij();

    /**
     * Returns the value of the '<em><b>Vcomp IEEE Type2</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vcomp IEEE Type2</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vcomp IEEE Type2</em>' reference.
     * @see #isSetVcompIEEEType2()
     * @see #unsetVcompIEEEType2()
     * @see #setVcompIEEEType2(VCompIEEEType2)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenICompensationForGenJ_VcompIEEEType2()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getGenICompensationForGenJ
     * @model opposite="GenICompensationForGenJ" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenICompensationForGenJ.VcompIEEEType2' kind='element'"
     * @generated
     */
    VCompIEEEType2 getVcompIEEEType2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vcomp IEEE Type2</em>' reference.
     * @see #isSetVcompIEEEType2()
     * @see #unsetVcompIEEEType2()
     * @see #getVcompIEEEType2()
     * @generated
     */
    void setVcompIEEEType2( VCompIEEEType2 value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVcompIEEEType2()
     * @see #getVcompIEEEType2()
     * @see #setVcompIEEEType2(VCompIEEEType2)
     * @generated
     */
    void unsetVcompIEEEType2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vcomp IEEE Type2</em>' reference is set.
     * @see #unsetVcompIEEEType2()
     * @see #getVcompIEEEType2()
     * @see #setVcompIEEEType2(VCompIEEEType2)
     * @generated
     */
    boolean isSetVcompIEEEType2();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronous Machine Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenICompensationForGenJ_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics#getGenICompensationForGenJ
     * @model opposite="GenICompensationForGenJ" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenICompensationForGenJ.SynchronousMachineDynamics' kind='element'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @generated
     */
    void setSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetSynchronousMachineDynamics();

} // GenICompensationForGenJ
