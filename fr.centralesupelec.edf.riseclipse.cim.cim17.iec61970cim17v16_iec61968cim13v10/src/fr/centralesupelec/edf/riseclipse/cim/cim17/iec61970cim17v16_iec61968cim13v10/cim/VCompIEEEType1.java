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
 * A representation of the model object '<em><b>VComp IEEE Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getRc <em>Rc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getXc <em>Xc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType1()
 * @model
 * @generated
 */
public interface VCompIEEEType1 extends VoltageCompensatorDynamics {
    /**
     * Returns the value of the '<em><b>Rc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rc</em>' attribute.
     * @see #isSetRc()
     * @see #unsetRc()
     * @see #setRc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType1_Rc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VCompIEEEType1.rc' kind='element'"
     * @generated
     */
    Float getRc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getRc <em>Rc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rc</em>' attribute.
     * @see #isSetRc()
     * @see #unsetRc()
     * @see #getRc()
     * @generated
     */
    void setRc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getRc <em>Rc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRc()
     * @see #getRc()
     * @see #setRc(Float)
     * @generated
     */
    void unsetRc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getRc <em>Rc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rc</em>' attribute is set.
     * @see #unsetRc()
     * @see #getRc()
     * @see #setRc(Float)
     * @generated
     */
    boolean isSetRc();

    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType1_Tr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VCompIEEEType1.tr' kind='element'"
     * @generated
     */
    Float getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Float)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Float)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Xc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xc</em>' attribute.
     * @see #isSetXc()
     * @see #unsetXc()
     * @see #setXc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType1_Xc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VCompIEEEType1.xc' kind='element'"
     * @generated
     */
    Float getXc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getXc <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xc</em>' attribute.
     * @see #isSetXc()
     * @see #unsetXc()
     * @see #getXc()
     * @generated
     */
    void setXc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getXc <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXc()
     * @see #getXc()
     * @see #setXc(Float)
     * @generated
     */
    void unsetXc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType1#getXc <em>Xc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xc</em>' attribute is set.
     * @see #unsetXc()
     * @see #getXc()
     * @see #setXc(Float)
     * @generated
     */
    boolean isSetXc();

} // VCompIEEEType1
