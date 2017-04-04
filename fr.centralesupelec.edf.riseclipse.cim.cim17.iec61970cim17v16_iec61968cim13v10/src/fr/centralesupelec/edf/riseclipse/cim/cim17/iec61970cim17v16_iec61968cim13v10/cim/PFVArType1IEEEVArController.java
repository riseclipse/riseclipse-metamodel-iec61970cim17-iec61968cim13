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
 * A representation of the model object '<em><b>PFV Ar Type1 IEEEV Ar Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController()
 * @model
 * @generated
 */
public interface PFVArType1IEEEVArController extends PFVArControllerType1Dynamics {
    /**
     * Returns the value of the '<em><b>Tvarc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tvarc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tvarc</em>' attribute.
     * @see #isSetTvarc()
     * @see #unsetTvarc()
     * @see #setTvarc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController_Tvarc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEVArController.tvarc' kind='element'"
     * @generated
     */
    Float getTvarc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tvarc</em>' attribute.
     * @see #isSetTvarc()
     * @see #unsetTvarc()
     * @see #getTvarc()
     * @generated
     */
    void setTvarc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTvarc()
     * @see #getTvarc()
     * @see #setTvarc(Float)
     * @generated
     */
    void unsetTvarc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tvarc</em>' attribute is set.
     * @see #unsetTvarc()
     * @see #getTvarc()
     * @see #setTvarc(Float)
     * @generated
     */
    boolean isSetTvarc();

    /**
     * Returns the value of the '<em><b>Vvar</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vvar</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vvar</em>' attribute.
     * @see #isSetVvar()
     * @see #unsetVvar()
     * @see #setVvar(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController_Vvar()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEVArController.vvar' kind='element'"
     * @generated
     */
    Float getVvar();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvar</em>' attribute.
     * @see #isSetVvar()
     * @see #unsetVvar()
     * @see #getVvar()
     * @generated
     */
    void setVvar( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvar()
     * @see #getVvar()
     * @see #setVvar(Float)
     * @generated
     */
    void unsetVvar();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvar</em>' attribute is set.
     * @see #unsetVvar()
     * @see #getVvar()
     * @see #setVvar(Float)
     * @generated
     */
    boolean isSetVvar();

    /**
     * Returns the value of the '<em><b>Vvarcbw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vvarcbw</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vvarcbw</em>' attribute.
     * @see #isSetVvarcbw()
     * @see #unsetVvarcbw()
     * @see #setVvarcbw(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController_Vvarcbw()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEVArController.vvarcbw' kind='element'"
     * @generated
     */
    Float getVvarcbw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvarcbw</em>' attribute.
     * @see #isSetVvarcbw()
     * @see #unsetVvarcbw()
     * @see #getVvarcbw()
     * @generated
     */
    void setVvarcbw( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvarcbw()
     * @see #getVvarcbw()
     * @see #setVvarcbw(Float)
     * @generated
     */
    void unsetVvarcbw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvarcbw</em>' attribute is set.
     * @see #unsetVvarcbw()
     * @see #getVvarcbw()
     * @see #setVvarcbw(Float)
     * @generated
     */
    boolean isSetVvarcbw();

    /**
     * Returns the value of the '<em><b>Vvarref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vvarref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vvarref</em>' attribute.
     * @see #isSetVvarref()
     * @see #unsetVvarref()
     * @see #setVvarref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController_Vvarref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEVArController.vvarref' kind='element'"
     * @generated
     */
    Float getVvarref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvarref</em>' attribute.
     * @see #isSetVvarref()
     * @see #unsetVvarref()
     * @see #getVvarref()
     * @generated
     */
    void setVvarref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvarref()
     * @see #getVvarref()
     * @see #setVvarref(Float)
     * @generated
     */
    void unsetVvarref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvarref</em>' attribute is set.
     * @see #unsetVvarref()
     * @see #getVvarref()
     * @see #setVvarref(Float)
     * @generated
     */
    boolean isSetVvarref();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController_Vvtmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEVArController.vvtmax' kind='element'"
     * @generated
     */
    Float getVvtmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmax()
     * @see #getVvtmax()
     * @see #setVvtmax(Float)
     * @generated
     */
    void unsetVvtmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType1IEEEVArController_Vvtmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType1IEEEVArController.vvtmin' kind='element'"
     * @generated
     */
    Float getVvtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Float)
     * @generated
     */
    void unsetVvtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvtmin</em>' attribute is set.
     * @see #unsetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Float)
     * @generated
     */
    boolean isSetVvtmin();

} // PFVArType1IEEEVArController
