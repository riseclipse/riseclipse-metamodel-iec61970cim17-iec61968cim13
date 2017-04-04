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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Cont PType3 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTwref <em>Twref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUpdip <em>Updip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWdtd <em>Wdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getZeta <em>Zeta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC()
 * @model
 * @generated
 */
public interface WindContPType3IEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dpmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #setDpmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Dpmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.dpmax' kind='element'"
     * @generated
     */
    Float getDpmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @generated
     */
    void setDpmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Float)
     * @generated
     */
    void unsetDpmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmax</em>' attribute is set.
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Float)
     * @generated
     */
    boolean isSetDpmax();

    /**
     * Returns the value of the '<em><b>Dprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dprefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #setDprefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Dprefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.dprefmax' kind='element'"
     * @generated
     */
    Float getDprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @generated
     */
    void setDprefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Float)
     * @generated
     */
    void unsetDprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmax</em>' attribute is set.
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Float)
     * @generated
     */
    boolean isSetDprefmax();

    /**
     * Returns the value of the '<em><b>Dprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dprefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #setDprefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Dprefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.dprefmin' kind='element'"
     * @generated
     */
    Float getDprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @generated
     */
    void setDprefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Float)
     * @generated
     */
    void unsetDprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmin</em>' attribute is set.
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Float)
     * @generated
     */
    boolean isSetDprefmin();

    /**
     * Returns the value of the '<em><b>Dthetamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dthetamax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #setDthetamax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Dthetamax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.dthetamax' kind='element'"
     * @generated
     */
    Float getDthetamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @generated
     */
    void setDthetamax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Float)
     * @generated
     */
    void unsetDthetamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamax</em>' attribute is set.
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Float)
     * @generated
     */
    boolean isSetDthetamax();

    /**
     * Returns the value of the '<em><b>Dthetamaxuvrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dthetamaxuvrt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dthetamaxuvrt</em>' attribute.
     * @see #isSetDthetamaxuvrt()
     * @see #unsetDthetamaxuvrt()
     * @see #setDthetamaxuvrt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Dthetamaxuvrt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.dthetamaxuvrt' kind='element'"
     * @generated
     */
    Float getDthetamaxuvrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamaxuvrt</em>' attribute.
     * @see #isSetDthetamaxuvrt()
     * @see #unsetDthetamaxuvrt()
     * @see #getDthetamaxuvrt()
     * @generated
     */
    void setDthetamaxuvrt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamaxuvrt()
     * @see #getDthetamaxuvrt()
     * @see #setDthetamaxuvrt(Float)
     * @generated
     */
    void unsetDthetamaxuvrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamaxuvrt</em>' attribute is set.
     * @see #unsetDthetamaxuvrt()
     * @see #getDthetamaxuvrt()
     * @see #setDthetamaxuvrt(Float)
     * @generated
     */
    boolean isSetDthetamaxuvrt();

    /**
     * Returns the value of the '<em><b>Kdtd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kdtd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kdtd</em>' attribute.
     * @see #isSetKdtd()
     * @see #unsetKdtd()
     * @see #setKdtd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Kdtd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.kdtd' kind='element'"
     * @generated
     */
    Float getKdtd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdtd</em>' attribute.
     * @see #isSetKdtd()
     * @see #unsetKdtd()
     * @see #getKdtd()
     * @generated
     */
    void setKdtd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdtd()
     * @see #getKdtd()
     * @see #setKdtd(Float)
     * @generated
     */
    void unsetKdtd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdtd</em>' attribute is set.
     * @see #unsetKdtd()
     * @see #getKdtd()
     * @see #setKdtd(Float)
     * @generated
     */
    boolean isSetKdtd();

    /**
     * Returns the value of the '<em><b>Kip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kip</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kip</em>' attribute.
     * @see #isSetKip()
     * @see #unsetKip()
     * @see #setKip(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Kip()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.kip' kind='element'"
     * @generated
     */
    Float getKip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKip <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kip</em>' attribute.
     * @see #isSetKip()
     * @see #unsetKip()
     * @see #getKip()
     * @generated
     */
    void setKip( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKip <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKip()
     * @see #getKip()
     * @see #setKip(Float)
     * @generated
     */
    void unsetKip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKip <em>Kip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kip</em>' attribute is set.
     * @see #unsetKip()
     * @see #getKip()
     * @see #setKip(Float)
     * @generated
     */
    boolean isSetKip();

    /**
     * Returns the value of the '<em><b>Kpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpp</em>' attribute.
     * @see #isSetKpp()
     * @see #unsetKpp()
     * @see #setKpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Kpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.kpp' kind='element'"
     * @generated
     */
    Float getKpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKpp <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpp</em>' attribute.
     * @see #isSetKpp()
     * @see #unsetKpp()
     * @see #getKpp()
     * @generated
     */
    void setKpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKpp <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpp()
     * @see #getKpp()
     * @see #setKpp(Float)
     * @generated
     */
    void unsetKpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getKpp <em>Kpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpp</em>' attribute is set.
     * @see #unsetKpp()
     * @see #getKpp()
     * @see #setKpp(Float)
     * @generated
     */
    boolean isSetKpp();

    /**
     * Returns the value of the '<em><b>Mpuvrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mpuvrt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mpuvrt</em>' attribute.
     * @see #isSetMpuvrt()
     * @see #unsetMpuvrt()
     * @see #setMpuvrt(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Mpuvrt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.mpuvrt' kind='element'"
     * @generated
     */
    Boolean getMpuvrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mpuvrt</em>' attribute.
     * @see #isSetMpuvrt()
     * @see #unsetMpuvrt()
     * @see #getMpuvrt()
     * @generated
     */
    void setMpuvrt( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMpuvrt()
     * @see #getMpuvrt()
     * @see #setMpuvrt(Boolean)
     * @generated
     */
    void unsetMpuvrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mpuvrt</em>' attribute is set.
     * @see #unsetMpuvrt()
     * @see #getMpuvrt()
     * @see #setMpuvrt(Boolean)
     * @generated
     */
    boolean isSetMpuvrt();

    /**
     * Returns the value of the '<em><b>Omegaoffset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Omegaoffset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Omegaoffset</em>' attribute.
     * @see #isSetOmegaoffset()
     * @see #unsetOmegaoffset()
     * @see #setOmegaoffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Omegaoffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.omegaoffset' kind='element'"
     * @generated
     */
    Float getOmegaoffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegaoffset</em>' attribute.
     * @see #isSetOmegaoffset()
     * @see #unsetOmegaoffset()
     * @see #getOmegaoffset()
     * @generated
     */
    void setOmegaoffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegaoffset()
     * @see #getOmegaoffset()
     * @see #setOmegaoffset(Float)
     * @generated
     */
    void unsetOmegaoffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegaoffset</em>' attribute is set.
     * @see #unsetOmegaoffset()
     * @see #getOmegaoffset()
     * @see #setOmegaoffset(Float)
     * @generated
     */
    boolean isSetOmegaoffset();

    /**
     * Returns the value of the '<em><b>Pdtdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pdtdmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pdtdmax</em>' attribute.
     * @see #isSetPdtdmax()
     * @see #unsetPdtdmax()
     * @see #setPdtdmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Pdtdmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.pdtdmax' kind='element'"
     * @generated
     */
    Float getPdtdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pdtdmax</em>' attribute.
     * @see #isSetPdtdmax()
     * @see #unsetPdtdmax()
     * @see #getPdtdmax()
     * @generated
     */
    void setPdtdmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPdtdmax()
     * @see #getPdtdmax()
     * @see #setPdtdmax(Float)
     * @generated
     */
    void unsetPdtdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pdtdmax</em>' attribute is set.
     * @see #unsetPdtdmax()
     * @see #getPdtdmax()
     * @see #setPdtdmax(Float)
     * @generated
     */
    boolean isSetPdtdmax();

    /**
     * Returns the value of the '<em><b>Tdvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tdvs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tdvs</em>' attribute.
     * @see #isSetTdvs()
     * @see #unsetTdvs()
     * @see #setTdvs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Tdvs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.tdvs' kind='element'"
     * @generated
     */
    Float getTdvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdvs</em>' attribute.
     * @see #isSetTdvs()
     * @see #unsetTdvs()
     * @see #getTdvs()
     * @generated
     */
    void setTdvs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdvs()
     * @see #getTdvs()
     * @see #setTdvs(Float)
     * @generated
     */
    void unsetTdvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdvs</em>' attribute is set.
     * @see #unsetTdvs()
     * @see #getTdvs()
     * @see #setTdvs(Float)
     * @generated
     */
    boolean isSetTdvs();

    /**
     * Returns the value of the '<em><b>Thetaemin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetaemin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetaemin</em>' attribute.
     * @see #isSetThetaemin()
     * @see #unsetThetaemin()
     * @see #setThetaemin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Thetaemin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.thetaemin' kind='element'"
     * @generated
     */
    Float getThetaemin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetaemin</em>' attribute.
     * @see #isSetThetaemin()
     * @see #unsetThetaemin()
     * @see #getThetaemin()
     * @generated
     */
    void setThetaemin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetaemin()
     * @see #getThetaemin()
     * @see #setThetaemin(Float)
     * @generated
     */
    void unsetThetaemin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetaemin</em>' attribute is set.
     * @see #unsetThetaemin()
     * @see #getThetaemin()
     * @see #setThetaemin(Float)
     * @generated
     */
    boolean isSetThetaemin();

    /**
     * Returns the value of the '<em><b>Thetauscale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetauscale</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetauscale</em>' attribute.
     * @see #isSetThetauscale()
     * @see #unsetThetauscale()
     * @see #setThetauscale(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Thetauscale()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.thetauscale' kind='element'"
     * @generated
     */
    Float getThetauscale();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetauscale</em>' attribute.
     * @see #isSetThetauscale()
     * @see #unsetThetauscale()
     * @see #getThetauscale()
     * @generated
     */
    void setThetauscale( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetauscale()
     * @see #getThetauscale()
     * @see #setThetauscale(Float)
     * @generated
     */
    void unsetThetauscale();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetauscale</em>' attribute is set.
     * @see #unsetThetauscale()
     * @see #getThetauscale()
     * @see #setThetauscale(Float)
     * @generated
     */
    boolean isSetThetauscale();

    /**
     * Returns the value of the '<em><b>Tomegafiltp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tomegafiltp3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tomegafiltp3</em>' attribute.
     * @see #isSetTomegafiltp3()
     * @see #unsetTomegafiltp3()
     * @see #setTomegafiltp3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Tomegafiltp3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.tomegafiltp3' kind='element'"
     * @generated
     */
    Float getTomegafiltp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomegafiltp3</em>' attribute.
     * @see #isSetTomegafiltp3()
     * @see #unsetTomegafiltp3()
     * @see #getTomegafiltp3()
     * @generated
     */
    void setTomegafiltp3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomegafiltp3()
     * @see #getTomegafiltp3()
     * @see #setTomegafiltp3(Float)
     * @generated
     */
    void unsetTomegafiltp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomegafiltp3</em>' attribute is set.
     * @see #unsetTomegafiltp3()
     * @see #getTomegafiltp3()
     * @see #setTomegafiltp3(Float)
     * @generated
     */
    boolean isSetTomegafiltp3();

    /**
     * Returns the value of the '<em><b>Tpfiltp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpfiltp3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpfiltp3</em>' attribute.
     * @see #isSetTpfiltp3()
     * @see #unsetTpfiltp3()
     * @see #setTpfiltp3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Tpfiltp3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.tpfiltp3' kind='element'"
     * @generated
     */
    Float getTpfiltp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfiltp3</em>' attribute.
     * @see #isSetTpfiltp3()
     * @see #unsetTpfiltp3()
     * @see #getTpfiltp3()
     * @generated
     */
    void setTpfiltp3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfiltp3()
     * @see #getTpfiltp3()
     * @see #setTpfiltp3(Float)
     * @generated
     */
    void unsetTpfiltp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfiltp3</em>' attribute is set.
     * @see #unsetTpfiltp3()
     * @see #getTpfiltp3()
     * @see #setTpfiltp3(Float)
     * @generated
     */
    boolean isSetTpfiltp3();

    /**
     * Returns the value of the '<em><b>Tpord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpord</em>' attribute.
     * @see #isSetTpord()
     * @see #unsetTpord()
     * @see #setTpord(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Tpord()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.tpord' kind='element'"
     * @generated
     */
    Float getTpord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpord <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpord</em>' attribute.
     * @see #isSetTpord()
     * @see #unsetTpord()
     * @see #getTpord()
     * @generated
     */
    void setTpord( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpord <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpord()
     * @see #getTpord()
     * @see #setTpord(Float)
     * @generated
     */
    void unsetTpord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTpord <em>Tpord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpord</em>' attribute is set.
     * @see #unsetTpord()
     * @see #getTpord()
     * @see #setTpord(Float)
     * @generated
     */
    boolean isSetTpord();

    /**
     * Returns the value of the '<em><b>Tufiltp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tufiltp3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tufiltp3</em>' attribute.
     * @see #isSetTufiltp3()
     * @see #unsetTufiltp3()
     * @see #setTufiltp3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Tufiltp3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.tufiltp3' kind='element'"
     * @generated
     */
    Float getTufiltp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltp3</em>' attribute.
     * @see #isSetTufiltp3()
     * @see #unsetTufiltp3()
     * @see #getTufiltp3()
     * @generated
     */
    void setTufiltp3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltp3()
     * @see #getTufiltp3()
     * @see #setTufiltp3(Float)
     * @generated
     */
    void unsetTufiltp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltp3</em>' attribute is set.
     * @see #unsetTufiltp3()
     * @see #getTufiltp3()
     * @see #setTufiltp3(Float)
     * @generated
     */
    boolean isSetTufiltp3();

    /**
     * Returns the value of the '<em><b>Twref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twref</em>' attribute.
     * @see #isSetTwref()
     * @see #unsetTwref()
     * @see #setTwref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Twref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.twref' kind='element'"
     * @generated
     */
    Float getTwref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTwref <em>Twref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twref</em>' attribute.
     * @see #isSetTwref()
     * @see #unsetTwref()
     * @see #getTwref()
     * @generated
     */
    void setTwref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTwref <em>Twref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwref()
     * @see #getTwref()
     * @see #setTwref(Float)
     * @generated
     */
    void unsetTwref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getTwref <em>Twref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twref</em>' attribute is set.
     * @see #unsetTwref()
     * @see #getTwref()
     * @see #setTwref(Float)
     * @generated
     */
    boolean isSetTwref();

    /**
     * Returns the value of the '<em><b>Udvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Udvs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Udvs</em>' attribute.
     * @see #isSetUdvs()
     * @see #unsetUdvs()
     * @see #setUdvs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Udvs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.udvs' kind='element'"
     * @generated
     */
    Float getUdvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udvs</em>' attribute.
     * @see #isSetUdvs()
     * @see #unsetUdvs()
     * @see #getUdvs()
     * @generated
     */
    void setUdvs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdvs()
     * @see #getUdvs()
     * @see #setUdvs(Float)
     * @generated
     */
    void unsetUdvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udvs</em>' attribute is set.
     * @see #unsetUdvs()
     * @see #getUdvs()
     * @see #setUdvs(Float)
     * @generated
     */
    boolean isSetUdvs();

    /**
     * Returns the value of the '<em><b>Updip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Updip</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Updip</em>' attribute.
     * @see #isSetUpdip()
     * @see #unsetUpdip()
     * @see #setUpdip(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Updip()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.updip' kind='element'"
     * @generated
     */
    Float getUpdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUpdip <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Updip</em>' attribute.
     * @see #isSetUpdip()
     * @see #unsetUpdip()
     * @see #getUpdip()
     * @generated
     */
    void setUpdip( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUpdip <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpdip()
     * @see #getUpdip()
     * @see #setUpdip(Float)
     * @generated
     */
    void unsetUpdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getUpdip <em>Updip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Updip</em>' attribute is set.
     * @see #unsetUpdip()
     * @see #getUpdip()
     * @see #setUpdip(Float)
     * @generated
     */
    boolean isSetUpdip();

    /**
     * Returns the value of the '<em><b>Wdtd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wdtd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wdtd</em>' attribute.
     * @see #isSetWdtd()
     * @see #unsetWdtd()
     * @see #setWdtd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Wdtd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.wdtd' kind='element'"
     * @generated
     */
    Float getWdtd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWdtd <em>Wdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wdtd</em>' attribute.
     * @see #isSetWdtd()
     * @see #unsetWdtd()
     * @see #getWdtd()
     * @generated
     */
    void setWdtd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWdtd <em>Wdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWdtd()
     * @see #getWdtd()
     * @see #setWdtd(Float)
     * @generated
     */
    void unsetWdtd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWdtd <em>Wdtd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wdtd</em>' attribute is set.
     * @see #unsetWdtd()
     * @see #getWdtd()
     * @see #setWdtd(Float)
     * @generated
     */
    boolean isSetWdtd();

    /**
     * Returns the value of the '<em><b>Zeta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zeta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zeta</em>' attribute.
     * @see #isSetZeta()
     * @see #unsetZeta()
     * @see #setZeta(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_Zeta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.zeta' kind='element'"
     * @generated
     */
    Float getZeta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getZeta <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zeta</em>' attribute.
     * @see #isSetZeta()
     * @see #unsetZeta()
     * @see #getZeta()
     * @generated
     */
    void setZeta( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getZeta <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZeta()
     * @see #getZeta()
     * @see #setZeta(Float)
     * @generated
     */
    void unsetZeta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getZeta <em>Zeta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zeta</em>' attribute is set.
     * @see #unsetZeta()
     * @see #getZeta()
     * @see #setZeta(Float)
     * @generated
     */
    boolean isSetZeta();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Dynamics Lookup Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindContPType3IEC
     * @model opposite="WindContPType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.WindDynamicsLookupTable' kind='element'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType3IEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPType3IEC
     * @model opposite="WindContPType3IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType3IEC.WindTurbineType3IEC' kind='element'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @generated
     */
    void setWindTurbineType3IEC( WindTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

} // WindContPType3IEC
