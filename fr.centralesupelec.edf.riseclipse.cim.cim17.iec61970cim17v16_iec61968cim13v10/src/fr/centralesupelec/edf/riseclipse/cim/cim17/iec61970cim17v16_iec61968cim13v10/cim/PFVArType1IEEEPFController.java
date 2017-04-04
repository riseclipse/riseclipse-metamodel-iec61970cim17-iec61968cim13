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
 * A representation of the model object '<em><b>PFV Ar Type1 IEEEPF Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController()
 * @model
 * @generated
 */
public interface PFVArType1IEEEPFController extends PFVArControllerType1Dynamics {
    /**
     * Returns the value of the '<em><b>Ovex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ovex</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ovex</em>' attribute.
     * @see #isSetOvex()
     * @see #unsetOvex()
     * @see #setOvex(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Ovex()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.ovex' kind='element'"
     * @generated
     */
    Boolean getOvex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ovex</em>' attribute.
     * @see #isSetOvex()
     * @see #unsetOvex()
     * @see #getOvex()
     * @generated
     */
    void setOvex( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOvex()
     * @see #getOvex()
     * @see #setOvex(Boolean)
     * @generated
     */
    void unsetOvex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ovex</em>' attribute is set.
     * @see #unsetOvex()
     * @see #getOvex()
     * @see #setOvex(Boolean)
     * @generated
     */
    boolean isSetOvex();

    /**
     * Returns the value of the '<em><b>Tpfc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpfc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpfc</em>' attribute.
     * @see #isSetTpfc()
     * @see #unsetTpfc()
     * @see #setTpfc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Tpfc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.tpfc' kind='element'"
     * @generated
     */
    Float getTpfc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfc</em>' attribute.
     * @see #isSetTpfc()
     * @see #unsetTpfc()
     * @see #getTpfc()
     * @generated
     */
    void setTpfc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfc()
     * @see #getTpfc()
     * @see #setTpfc(Float)
     * @generated
     */
    void unsetTpfc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfc</em>' attribute is set.
     * @see #unsetTpfc()
     * @see #getTpfc()
     * @see #setTpfc(Float)
     * @generated
     */
    boolean isSetTpfc();

    /**
     * Returns the value of the '<em><b>Vitmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vitmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vitmin</em>' attribute.
     * @see #isSetVitmin()
     * @see #unsetVitmin()
     * @see #setVitmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Vitmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.vitmin' kind='element'"
     * @generated
     */
    Float getVitmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vitmin</em>' attribute.
     * @see #isSetVitmin()
     * @see #unsetVitmin()
     * @see #getVitmin()
     * @generated
     */
    void setVitmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVitmin()
     * @see #getVitmin()
     * @see #setVitmin(Float)
     * @generated
     */
    void unsetVitmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vitmin</em>' attribute is set.
     * @see #unsetVitmin()
     * @see #getVitmin()
     * @see #setVitmin(Float)
     * @generated
     */
    boolean isSetVitmin();

    /**
     * Returns the value of the '<em><b>Vpf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vpf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vpf</em>' attribute.
     * @see #isSetVpf()
     * @see #unsetVpf()
     * @see #setVpf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Vpf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.vpf' kind='element'"
     * @generated
     */
    Float getVpf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpf</em>' attribute.
     * @see #isSetVpf()
     * @see #unsetVpf()
     * @see #getVpf()
     * @generated
     */
    void setVpf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpf()
     * @see #getVpf()
     * @see #setVpf(Float)
     * @generated
     */
    void unsetVpf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpf</em>' attribute is set.
     * @see #unsetVpf()
     * @see #getVpf()
     * @see #setVpf(Float)
     * @generated
     */
    boolean isSetVpf();

    /**
     * Returns the value of the '<em><b>Vpfcbw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vpfcbw</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vpfcbw</em>' attribute.
     * @see #isSetVpfcbw()
     * @see #unsetVpfcbw()
     * @see #setVpfcbw(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Vpfcbw()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.vpfcbw' kind='element'"
     * @generated
     */
    Float getVpfcbw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpfcbw</em>' attribute.
     * @see #isSetVpfcbw()
     * @see #unsetVpfcbw()
     * @see #getVpfcbw()
     * @generated
     */
    void setVpfcbw( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpfcbw()
     * @see #getVpfcbw()
     * @see #setVpfcbw(Float)
     * @generated
     */
    void unsetVpfcbw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpfcbw</em>' attribute is set.
     * @see #unsetVpfcbw()
     * @see #getVpfcbw()
     * @see #setVpfcbw(Float)
     * @generated
     */
    boolean isSetVpfcbw();

    /**
     * Returns the value of the '<em><b>Vpfref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vpfref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vpfref</em>' attribute.
     * @see #isSetVpfref()
     * @see #unsetVpfref()
     * @see #setVpfref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Vpfref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.vpfref' kind='element'"
     * @generated
     */
    Float getVpfref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpfref</em>' attribute.
     * @see #isSetVpfref()
     * @see #unsetVpfref()
     * @see #getVpfref()
     * @generated
     */
    void setVpfref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpfref()
     * @see #getVpfref()
     * @see #setVpfref(Float)
     * @generated
     */
    void unsetVpfref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpfref</em>' attribute is set.
     * @see #unsetVpfref()
     * @see #getVpfref()
     * @see #setVpfref(Float)
     * @generated
     */
    boolean isSetVpfref();

    /**
     * Returns the value of the '<em><b>Vvtmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vvtmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vvtmax</em>' attribute.
     * @see #isSetVvtmax()
     * @see #unsetVvtmax()
     * @see #setVvtmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Vvtmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.vvtmax' kind='element'"
     * @generated
     */
    Float getVvtmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvtmax</em>' attribute.
     * @see #isSetVvtmax()
     * @see #unsetVvtmax()
     * @see #getVvtmax()
     * @generated
     */
    void setVvtmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmax()
     * @see #getVvtmax()
     * @see #setVvtmax(Float)
     * @generated
     */
    void unsetVvtmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvtmax</em>' attribute is set.
     * @see #unsetVvtmax()
     * @see #getVvtmax()
     * @see #setVvtmax(Float)
     * @generated
     */
    boolean isSetVvtmax();

    /**
     * Returns the value of the '<em><b>Vvtmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vvtmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vvtmin</em>' attribute.
     * @see #isSetVvtmin()
     * @see #unsetVvtmin()
     * @see #setVvtmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEPFController_Vvtmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEPFController.vvtmin' kind='element'"
     * @generated
     */
    Float getVvtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvtmin</em>' attribute.
     * @see #isSetVvtmin()
     * @see #unsetVvtmin()
     * @see #getVvtmin()
     * @generated
     */
    void setVvtmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Float)
     * @generated
     */
    void unsetVvtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvtmin</em>' attribute is set.
     * @see #unsetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Float)
     * @generated
     */
    boolean isSetVvtmin();

} // PFVArType1IEEEPFController
