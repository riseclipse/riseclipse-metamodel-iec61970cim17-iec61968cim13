/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfd <em>Epfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfs <em>Epfs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvd <em>Epvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvs <em>Epvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfd <em>Eqfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfs <em>Eqfs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvd <em>Eqvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvs <em>Eqvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getH <em>H</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getLfrac <em>Lfrac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getPfrac <em>Pfrac</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite()
 * @model
 * @generated
 */
public interface LoadComposite extends LoadDynamics {
    /**
     * Returns the value of the '<em><b>Epfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Epfd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Epfd</em>' attribute.
     * @see #isSetEpfd()
     * @see #unsetEpfd()
     * @see #setEpfd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Epfd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.epfd' kind='element'"
     * @generated
     */
    Float getEpfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfd <em>Epfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epfd</em>' attribute.
     * @see #isSetEpfd()
     * @see #unsetEpfd()
     * @see #getEpfd()
     * @generated
     */
    void setEpfd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfd <em>Epfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpfd()
     * @see #getEpfd()
     * @see #setEpfd(Float)
     * @generated
     */
    void unsetEpfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfd <em>Epfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epfd</em>' attribute is set.
     * @see #unsetEpfd()
     * @see #getEpfd()
     * @see #setEpfd(Float)
     * @generated
     */
    boolean isSetEpfd();

    /**
     * Returns the value of the '<em><b>Epfs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Epfs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Epfs</em>' attribute.
     * @see #isSetEpfs()
     * @see #unsetEpfs()
     * @see #setEpfs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Epfs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.epfs' kind='element'"
     * @generated
     */
    Float getEpfs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfs <em>Epfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epfs</em>' attribute.
     * @see #isSetEpfs()
     * @see #unsetEpfs()
     * @see #getEpfs()
     * @generated
     */
    void setEpfs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfs <em>Epfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpfs()
     * @see #getEpfs()
     * @see #setEpfs(Float)
     * @generated
     */
    void unsetEpfs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpfs <em>Epfs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epfs</em>' attribute is set.
     * @see #unsetEpfs()
     * @see #getEpfs()
     * @see #setEpfs(Float)
     * @generated
     */
    boolean isSetEpfs();

    /**
     * Returns the value of the '<em><b>Epvd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Epvd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Epvd</em>' attribute.
     * @see #isSetEpvd()
     * @see #unsetEpvd()
     * @see #setEpvd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Epvd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.epvd' kind='element'"
     * @generated
     */
    Float getEpvd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvd <em>Epvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epvd</em>' attribute.
     * @see #isSetEpvd()
     * @see #unsetEpvd()
     * @see #getEpvd()
     * @generated
     */
    void setEpvd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvd <em>Epvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpvd()
     * @see #getEpvd()
     * @see #setEpvd(Float)
     * @generated
     */
    void unsetEpvd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvd <em>Epvd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epvd</em>' attribute is set.
     * @see #unsetEpvd()
     * @see #getEpvd()
     * @see #setEpvd(Float)
     * @generated
     */
    boolean isSetEpvd();

    /**
     * Returns the value of the '<em><b>Epvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Epvs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Epvs</em>' attribute.
     * @see #isSetEpvs()
     * @see #unsetEpvs()
     * @see #setEpvs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Epvs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.epvs' kind='element'"
     * @generated
     */
    Float getEpvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvs <em>Epvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epvs</em>' attribute.
     * @see #isSetEpvs()
     * @see #unsetEpvs()
     * @see #getEpvs()
     * @generated
     */
    void setEpvs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvs <em>Epvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpvs()
     * @see #getEpvs()
     * @see #setEpvs(Float)
     * @generated
     */
    void unsetEpvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEpvs <em>Epvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epvs</em>' attribute is set.
     * @see #unsetEpvs()
     * @see #getEpvs()
     * @see #setEpvs(Float)
     * @generated
     */
    boolean isSetEpvs();

    /**
     * Returns the value of the '<em><b>Eqfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eqfd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eqfd</em>' attribute.
     * @see #isSetEqfd()
     * @see #unsetEqfd()
     * @see #setEqfd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Eqfd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.eqfd' kind='element'"
     * @generated
     */
    Float getEqfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfd <em>Eqfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqfd</em>' attribute.
     * @see #isSetEqfd()
     * @see #unsetEqfd()
     * @see #getEqfd()
     * @generated
     */
    void setEqfd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfd <em>Eqfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqfd()
     * @see #getEqfd()
     * @see #setEqfd(Float)
     * @generated
     */
    void unsetEqfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfd <em>Eqfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqfd</em>' attribute is set.
     * @see #unsetEqfd()
     * @see #getEqfd()
     * @see #setEqfd(Float)
     * @generated
     */
    boolean isSetEqfd();

    /**
     * Returns the value of the '<em><b>Eqfs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eqfs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eqfs</em>' attribute.
     * @see #isSetEqfs()
     * @see #unsetEqfs()
     * @see #setEqfs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Eqfs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.eqfs' kind='element'"
     * @generated
     */
    Float getEqfs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfs <em>Eqfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqfs</em>' attribute.
     * @see #isSetEqfs()
     * @see #unsetEqfs()
     * @see #getEqfs()
     * @generated
     */
    void setEqfs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfs <em>Eqfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqfs()
     * @see #getEqfs()
     * @see #setEqfs(Float)
     * @generated
     */
    void unsetEqfs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqfs <em>Eqfs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqfs</em>' attribute is set.
     * @see #unsetEqfs()
     * @see #getEqfs()
     * @see #setEqfs(Float)
     * @generated
     */
    boolean isSetEqfs();

    /**
     * Returns the value of the '<em><b>Eqvd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eqvd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eqvd</em>' attribute.
     * @see #isSetEqvd()
     * @see #unsetEqvd()
     * @see #setEqvd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Eqvd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.eqvd' kind='element'"
     * @generated
     */
    Float getEqvd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvd <em>Eqvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqvd</em>' attribute.
     * @see #isSetEqvd()
     * @see #unsetEqvd()
     * @see #getEqvd()
     * @generated
     */
    void setEqvd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvd <em>Eqvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqvd()
     * @see #getEqvd()
     * @see #setEqvd(Float)
     * @generated
     */
    void unsetEqvd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvd <em>Eqvd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqvd</em>' attribute is set.
     * @see #unsetEqvd()
     * @see #getEqvd()
     * @see #setEqvd(Float)
     * @generated
     */
    boolean isSetEqvd();

    /**
     * Returns the value of the '<em><b>Eqvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eqvs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eqvs</em>' attribute.
     * @see #isSetEqvs()
     * @see #unsetEqvs()
     * @see #setEqvs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Eqvs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.eqvs' kind='element'"
     * @generated
     */
    Float getEqvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvs <em>Eqvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqvs</em>' attribute.
     * @see #isSetEqvs()
     * @see #unsetEqvs()
     * @see #getEqvs()
     * @generated
     */
    void setEqvs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvs <em>Eqvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqvs()
     * @see #getEqvs()
     * @see #setEqvs(Float)
     * @generated
     */
    void unsetEqvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getEqvs <em>Eqvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqvs</em>' attribute is set.
     * @see #unsetEqvs()
     * @see #getEqvs()
     * @see #setEqvs(Float)
     * @generated
     */
    boolean isSetEqvs();

    /**
     * Returns the value of the '<em><b>H</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #setH(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_H()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.h' kind='element'"
     * @generated
     */
    Float getH();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #getH()
     * @generated
     */
    void setH( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetH()
     * @see #getH()
     * @see #setH(Float)
     * @generated
     */
    void unsetH();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getH <em>H</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>H</em>' attribute is set.
     * @see #unsetH()
     * @see #getH()
     * @see #setH(Float)
     * @generated
     */
    boolean isSetH();

    /**
     * Returns the value of the '<em><b>Lfrac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lfrac</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lfrac</em>' attribute.
     * @see #isSetLfrac()
     * @see #unsetLfrac()
     * @see #setLfrac(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Lfrac()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.lfrac' kind='element'"
     * @generated
     */
    Float getLfrac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getLfrac <em>Lfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lfrac</em>' attribute.
     * @see #isSetLfrac()
     * @see #unsetLfrac()
     * @see #getLfrac()
     * @generated
     */
    void setLfrac( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getLfrac <em>Lfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLfrac()
     * @see #getLfrac()
     * @see #setLfrac(Float)
     * @generated
     */
    void unsetLfrac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getLfrac <em>Lfrac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lfrac</em>' attribute is set.
     * @see #unsetLfrac()
     * @see #getLfrac()
     * @see #setLfrac(Float)
     * @generated
     */
    boolean isSetLfrac();

    /**
     * Returns the value of the '<em><b>Pfrac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pfrac</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #setPfrac(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadComposite_Pfrac()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadComposite.pfrac' kind='element'"
     * @generated
     */
    Float getPfrac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #getPfrac()
     * @generated
     */
    void setPfrac( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Float)
     * @generated
     */
    void unsetPfrac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite#getPfrac <em>Pfrac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfrac</em>' attribute is set.
     * @see #unsetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Float)
     * @generated
     */
    boolean isSetPfrac();

} // LoadComposite
