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
 * A representation of the model object '<em><b>Gov Steam CC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDhp <em>Dhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDlp <em>Dlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFhp <em>Fhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFlp <em>Flp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRhp <em>Rhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRlp <em>Rlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1hp <em>T1hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1lp <em>T1lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3hp <em>T3hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3lp <em>T3lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4hp <em>T4hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4lp <em>T4lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5hp <em>T5hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5lp <em>T5lp</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC()
 * @model
 * @generated
 */
public interface GovSteamCC extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Dhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dhp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dhp</em>' attribute.
     * @see #isSetDhp()
     * @see #unsetDhp()
     * @see #setDhp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Dhp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.dhp' kind='element'"
     * @generated
     */
    Float getDhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDhp <em>Dhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dhp</em>' attribute.
     * @see #isSetDhp()
     * @see #unsetDhp()
     * @see #getDhp()
     * @generated
     */
    void setDhp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDhp <em>Dhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDhp()
     * @see #getDhp()
     * @see #setDhp(Float)
     * @generated
     */
    void unsetDhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDhp <em>Dhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dhp</em>' attribute is set.
     * @see #unsetDhp()
     * @see #getDhp()
     * @see #setDhp(Float)
     * @generated
     */
    boolean isSetDhp();

    /**
     * Returns the value of the '<em><b>Dlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dlp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dlp</em>' attribute.
     * @see #isSetDlp()
     * @see #unsetDlp()
     * @see #setDlp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Dlp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.dlp' kind='element'"
     * @generated
     */
    Float getDlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDlp <em>Dlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dlp</em>' attribute.
     * @see #isSetDlp()
     * @see #unsetDlp()
     * @see #getDlp()
     * @generated
     */
    void setDlp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDlp <em>Dlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDlp()
     * @see #getDlp()
     * @see #setDlp(Float)
     * @generated
     */
    void unsetDlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getDlp <em>Dlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dlp</em>' attribute is set.
     * @see #unsetDlp()
     * @see #getDlp()
     * @see #setDlp(Float)
     * @generated
     */
    boolean isSetDlp();

    /**
     * Returns the value of the '<em><b>Fhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fhp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fhp</em>' attribute.
     * @see #isSetFhp()
     * @see #unsetFhp()
     * @see #setFhp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Fhp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.fhp' kind='element'"
     * @generated
     */
    Float getFhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFhp <em>Fhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fhp</em>' attribute.
     * @see #isSetFhp()
     * @see #unsetFhp()
     * @see #getFhp()
     * @generated
     */
    void setFhp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFhp <em>Fhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFhp()
     * @see #getFhp()
     * @see #setFhp(Float)
     * @generated
     */
    void unsetFhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFhp <em>Fhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fhp</em>' attribute is set.
     * @see #unsetFhp()
     * @see #getFhp()
     * @see #setFhp(Float)
     * @generated
     */
    boolean isSetFhp();

    /**
     * Returns the value of the '<em><b>Flp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flp</em>' attribute.
     * @see #isSetFlp()
     * @see #unsetFlp()
     * @see #setFlp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Flp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.flp' kind='element'"
     * @generated
     */
    Float getFlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFlp <em>Flp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flp</em>' attribute.
     * @see #isSetFlp()
     * @see #unsetFlp()
     * @see #getFlp()
     * @generated
     */
    void setFlp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFlp <em>Flp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlp()
     * @see #getFlp()
     * @see #setFlp(Float)
     * @generated
     */
    void unsetFlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getFlp <em>Flp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flp</em>' attribute is set.
     * @see #unsetFlp()
     * @see #getFlp()
     * @see #setFlp(Float)
     * @generated
     */
    boolean isSetFlp();

    /**
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mwbase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Mwbase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.mwbase' kind='element'"
     * @generated
     */
    Float getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @generated
     */
    void setMwbase( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    boolean isSetMwbase();

    /**
     * Returns the value of the '<em><b>Pmaxhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pmaxhp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pmaxhp</em>' attribute.
     * @see #isSetPmaxhp()
     * @see #unsetPmaxhp()
     * @see #setPmaxhp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Pmaxhp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.pmaxhp' kind='element'"
     * @generated
     */
    Float getPmaxhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmaxhp</em>' attribute.
     * @see #isSetPmaxhp()
     * @see #unsetPmaxhp()
     * @see #getPmaxhp()
     * @generated
     */
    void setPmaxhp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmaxhp()
     * @see #getPmaxhp()
     * @see #setPmaxhp(Float)
     * @generated
     */
    void unsetPmaxhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmaxhp</em>' attribute is set.
     * @see #unsetPmaxhp()
     * @see #getPmaxhp()
     * @see #setPmaxhp(Float)
     * @generated
     */
    boolean isSetPmaxhp();

    /**
     * Returns the value of the '<em><b>Pmaxlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pmaxlp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pmaxlp</em>' attribute.
     * @see #isSetPmaxlp()
     * @see #unsetPmaxlp()
     * @see #setPmaxlp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Pmaxlp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.pmaxlp' kind='element'"
     * @generated
     */
    Float getPmaxlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmaxlp</em>' attribute.
     * @see #isSetPmaxlp()
     * @see #unsetPmaxlp()
     * @see #getPmaxlp()
     * @generated
     */
    void setPmaxlp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmaxlp()
     * @see #getPmaxlp()
     * @see #setPmaxlp(Float)
     * @generated
     */
    void unsetPmaxlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmaxlp</em>' attribute is set.
     * @see #unsetPmaxlp()
     * @see #getPmaxlp()
     * @see #setPmaxlp(Float)
     * @generated
     */
    boolean isSetPmaxlp();

    /**
     * Returns the value of the '<em><b>Rhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rhp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rhp</em>' attribute.
     * @see #isSetRhp()
     * @see #unsetRhp()
     * @see #setRhp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Rhp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.rhp' kind='element'"
     * @generated
     */
    Float getRhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRhp <em>Rhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rhp</em>' attribute.
     * @see #isSetRhp()
     * @see #unsetRhp()
     * @see #getRhp()
     * @generated
     */
    void setRhp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRhp <em>Rhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRhp()
     * @see #getRhp()
     * @see #setRhp(Float)
     * @generated
     */
    void unsetRhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRhp <em>Rhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rhp</em>' attribute is set.
     * @see #unsetRhp()
     * @see #getRhp()
     * @see #setRhp(Float)
     * @generated
     */
    boolean isSetRhp();

    /**
     * Returns the value of the '<em><b>Rlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rlp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rlp</em>' attribute.
     * @see #isSetRlp()
     * @see #unsetRlp()
     * @see #setRlp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_Rlp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.rlp' kind='element'"
     * @generated
     */
    Float getRlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRlp <em>Rlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rlp</em>' attribute.
     * @see #isSetRlp()
     * @see #unsetRlp()
     * @see #getRlp()
     * @generated
     */
    void setRlp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRlp <em>Rlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRlp()
     * @see #getRlp()
     * @see #setRlp(Float)
     * @generated
     */
    void unsetRlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getRlp <em>Rlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rlp</em>' attribute is set.
     * @see #unsetRlp()
     * @see #getRlp()
     * @see #setRlp(Float)
     * @generated
     */
    boolean isSetRlp();

    /**
     * Returns the value of the '<em><b>T1hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T1hp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T1hp</em>' attribute.
     * @see #isSetT1hp()
     * @see #unsetT1hp()
     * @see #setT1hp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T1hp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t1hp' kind='element'"
     * @generated
     */
    Float getT1hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1hp <em>T1hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1hp</em>' attribute.
     * @see #isSetT1hp()
     * @see #unsetT1hp()
     * @see #getT1hp()
     * @generated
     */
    void setT1hp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1hp <em>T1hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1hp()
     * @see #getT1hp()
     * @see #setT1hp(Float)
     * @generated
     */
    void unsetT1hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1hp <em>T1hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1hp</em>' attribute is set.
     * @see #unsetT1hp()
     * @see #getT1hp()
     * @see #setT1hp(Float)
     * @generated
     */
    boolean isSetT1hp();

    /**
     * Returns the value of the '<em><b>T1lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T1lp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T1lp</em>' attribute.
     * @see #isSetT1lp()
     * @see #unsetT1lp()
     * @see #setT1lp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T1lp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t1lp' kind='element'"
     * @generated
     */
    Float getT1lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1lp <em>T1lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1lp</em>' attribute.
     * @see #isSetT1lp()
     * @see #unsetT1lp()
     * @see #getT1lp()
     * @generated
     */
    void setT1lp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1lp <em>T1lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1lp()
     * @see #getT1lp()
     * @see #setT1lp(Float)
     * @generated
     */
    void unsetT1lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT1lp <em>T1lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1lp</em>' attribute is set.
     * @see #unsetT1lp()
     * @see #getT1lp()
     * @see #setT1lp(Float)
     * @generated
     */
    boolean isSetT1lp();

    /**
     * Returns the value of the '<em><b>T3hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T3hp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T3hp</em>' attribute.
     * @see #isSetT3hp()
     * @see #unsetT3hp()
     * @see #setT3hp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T3hp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t3hp' kind='element'"
     * @generated
     */
    Float getT3hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3hp <em>T3hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3hp</em>' attribute.
     * @see #isSetT3hp()
     * @see #unsetT3hp()
     * @see #getT3hp()
     * @generated
     */
    void setT3hp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3hp <em>T3hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3hp()
     * @see #getT3hp()
     * @see #setT3hp(Float)
     * @generated
     */
    void unsetT3hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3hp <em>T3hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3hp</em>' attribute is set.
     * @see #unsetT3hp()
     * @see #getT3hp()
     * @see #setT3hp(Float)
     * @generated
     */
    boolean isSetT3hp();

    /**
     * Returns the value of the '<em><b>T3lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T3lp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T3lp</em>' attribute.
     * @see #isSetT3lp()
     * @see #unsetT3lp()
     * @see #setT3lp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T3lp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t3lp' kind='element'"
     * @generated
     */
    Float getT3lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3lp <em>T3lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3lp</em>' attribute.
     * @see #isSetT3lp()
     * @see #unsetT3lp()
     * @see #getT3lp()
     * @generated
     */
    void setT3lp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3lp <em>T3lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3lp()
     * @see #getT3lp()
     * @see #setT3lp(Float)
     * @generated
     */
    void unsetT3lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT3lp <em>T3lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3lp</em>' attribute is set.
     * @see #unsetT3lp()
     * @see #getT3lp()
     * @see #setT3lp(Float)
     * @generated
     */
    boolean isSetT3lp();

    /**
     * Returns the value of the '<em><b>T4hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T4hp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T4hp</em>' attribute.
     * @see #isSetT4hp()
     * @see #unsetT4hp()
     * @see #setT4hp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T4hp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t4hp' kind='element'"
     * @generated
     */
    Float getT4hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4hp <em>T4hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4hp</em>' attribute.
     * @see #isSetT4hp()
     * @see #unsetT4hp()
     * @see #getT4hp()
     * @generated
     */
    void setT4hp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4hp <em>T4hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4hp()
     * @see #getT4hp()
     * @see #setT4hp(Float)
     * @generated
     */
    void unsetT4hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4hp <em>T4hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4hp</em>' attribute is set.
     * @see #unsetT4hp()
     * @see #getT4hp()
     * @see #setT4hp(Float)
     * @generated
     */
    boolean isSetT4hp();

    /**
     * Returns the value of the '<em><b>T4lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T4lp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T4lp</em>' attribute.
     * @see #isSetT4lp()
     * @see #unsetT4lp()
     * @see #setT4lp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T4lp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t4lp' kind='element'"
     * @generated
     */
    Float getT4lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4lp <em>T4lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4lp</em>' attribute.
     * @see #isSetT4lp()
     * @see #unsetT4lp()
     * @see #getT4lp()
     * @generated
     */
    void setT4lp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4lp <em>T4lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4lp()
     * @see #getT4lp()
     * @see #setT4lp(Float)
     * @generated
     */
    void unsetT4lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT4lp <em>T4lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4lp</em>' attribute is set.
     * @see #unsetT4lp()
     * @see #getT4lp()
     * @see #setT4lp(Float)
     * @generated
     */
    boolean isSetT4lp();

    /**
     * Returns the value of the '<em><b>T5hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T5hp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T5hp</em>' attribute.
     * @see #isSetT5hp()
     * @see #unsetT5hp()
     * @see #setT5hp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T5hp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t5hp' kind='element'"
     * @generated
     */
    Float getT5hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5hp <em>T5hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5hp</em>' attribute.
     * @see #isSetT5hp()
     * @see #unsetT5hp()
     * @see #getT5hp()
     * @generated
     */
    void setT5hp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5hp <em>T5hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5hp()
     * @see #getT5hp()
     * @see #setT5hp(Float)
     * @generated
     */
    void unsetT5hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5hp <em>T5hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5hp</em>' attribute is set.
     * @see #unsetT5hp()
     * @see #getT5hp()
     * @see #setT5hp(Float)
     * @generated
     */
    boolean isSetT5hp();

    /**
     * Returns the value of the '<em><b>T5lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T5lp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T5lp</em>' attribute.
     * @see #isSetT5lp()
     * @see #unsetT5lp()
     * @see #setT5lp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovSteamCC_T5lp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovSteamCC.t5lp' kind='element'"
     * @generated
     */
    Float getT5lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5lp <em>T5lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5lp</em>' attribute.
     * @see #isSetT5lp()
     * @see #unsetT5lp()
     * @see #getT5lp()
     * @generated
     */
    void setT5lp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5lp <em>T5lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5lp()
     * @see #getT5lp()
     * @see #setT5lp(Float)
     * @generated
     */
    void unsetT5lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC#getT5lp <em>T5lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5lp</em>' attribute is set.
     * @see #unsetT5lp()
     * @see #getT5lp()
     * @see #setT5lp(Float)
     * @generated
     */
    boolean isSetT5lp();

} // GovSteamCC
