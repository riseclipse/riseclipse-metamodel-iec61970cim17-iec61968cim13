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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro4;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro4} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydro4ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydro4ItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addAtPropertyDescriptor( object );
            addBgv0PropertyDescriptor( object );
            addBgv1PropertyDescriptor( object );
            addBgv2PropertyDescriptor( object );
            addBgv3PropertyDescriptor( object );
            addBgv4PropertyDescriptor( object );
            addBgv5PropertyDescriptor( object );
            addBmaxPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addDturbPropertyDescriptor( object );
            addEpsPropertyDescriptor( object );
            addGmaxPropertyDescriptor( object );
            addGminPropertyDescriptor( object );
            addGv0PropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addHdamPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPgv0PropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addQn1PropertyDescriptor( object );
            addRpermPropertyDescriptor( object );
            addRtempPropertyDescriptor( object );
            addTbladePropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addUcPropertyDescriptor( object );
            addUoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_at_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_at_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_At(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bgv0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBgv0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bgv0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bgv0_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bgv0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bgv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBgv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bgv1_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bgv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bgv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBgv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bgv2_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bgv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bgv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBgv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bgv3_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bgv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bgv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBgv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bgv4_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bgv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bgv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBgv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bgv5_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bgv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_bmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_bmax_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Bmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_db1_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Db1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_db2_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Db2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_dturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_dturb_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Dturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_eps_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Eps(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gmax_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gmin_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gv0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gv0_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gv0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gv1_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gv2_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gv3_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gv4_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_gv5_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Gv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hdam feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHdamPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_hdam_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_hdam_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Hdam(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_mwbase_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_pgv0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_pgv0_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Pgv0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_pgv1_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Pgv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_pgv2_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Pgv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_pgv3_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Pgv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_pgv4_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Pgv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_pgv5_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Pgv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Qn1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQn1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_qn1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_qn1_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Qn1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rperm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRpermPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_rperm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_rperm_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Rperm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rtemp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRtempPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_rtemp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_rtemp_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Rtemp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tblade feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbladePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_tblade_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_tblade_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Tblade(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_tg_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Tg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_tp_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_tr_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Tr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_tw_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Tw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_uc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_uc_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Uc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro4_uo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro4_uo_feature",
                                "_UI_GovHydro4_type" ),
                        CimPackage.eINSTANCE.getGovHydro4_Uo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydro4.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydro4" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydro4 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydro4_type" )
                : getString( "_UI_GovHydro4_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( GovHydro4.class ) ) {
        case CimPackage.GOV_HYDRO4__AT:
        case CimPackage.GOV_HYDRO4__BGV0:
        case CimPackage.GOV_HYDRO4__BGV1:
        case CimPackage.GOV_HYDRO4__BGV2:
        case CimPackage.GOV_HYDRO4__BGV3:
        case CimPackage.GOV_HYDRO4__BGV4:
        case CimPackage.GOV_HYDRO4__BGV5:
        case CimPackage.GOV_HYDRO4__BMAX:
        case CimPackage.GOV_HYDRO4__DB1:
        case CimPackage.GOV_HYDRO4__DB2:
        case CimPackage.GOV_HYDRO4__DTURB:
        case CimPackage.GOV_HYDRO4__EPS:
        case CimPackage.GOV_HYDRO4__GMAX:
        case CimPackage.GOV_HYDRO4__GMIN:
        case CimPackage.GOV_HYDRO4__GV0:
        case CimPackage.GOV_HYDRO4__GV1:
        case CimPackage.GOV_HYDRO4__GV2:
        case CimPackage.GOV_HYDRO4__GV3:
        case CimPackage.GOV_HYDRO4__GV4:
        case CimPackage.GOV_HYDRO4__GV5:
        case CimPackage.GOV_HYDRO4__HDAM:
        case CimPackage.GOV_HYDRO4__MWBASE:
        case CimPackage.GOV_HYDRO4__PGV0:
        case CimPackage.GOV_HYDRO4__PGV1:
        case CimPackage.GOV_HYDRO4__PGV2:
        case CimPackage.GOV_HYDRO4__PGV3:
        case CimPackage.GOV_HYDRO4__PGV4:
        case CimPackage.GOV_HYDRO4__PGV5:
        case CimPackage.GOV_HYDRO4__QN1:
        case CimPackage.GOV_HYDRO4__RPERM:
        case CimPackage.GOV_HYDRO4__RTEMP:
        case CimPackage.GOV_HYDRO4__TBLADE:
        case CimPackage.GOV_HYDRO4__TG:
        case CimPackage.GOV_HYDRO4__TP:
        case CimPackage.GOV_HYDRO4__TR:
        case CimPackage.GOV_HYDRO4__TW:
        case CimPackage.GOV_HYDRO4__UC:
        case CimPackage.GOV_HYDRO4__UO:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
