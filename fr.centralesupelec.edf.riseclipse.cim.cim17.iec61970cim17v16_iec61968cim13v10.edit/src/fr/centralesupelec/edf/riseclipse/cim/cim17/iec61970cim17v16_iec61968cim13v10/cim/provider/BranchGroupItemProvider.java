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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BranchGroupItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BranchGroupItemProvider( AdapterFactory adapterFactory ) {
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

            addMaximumActivePowerPropertyDescriptor( object );
            addMaximumReactivePowerPropertyDescriptor( object );
            addMinimumActivePowerPropertyDescriptor( object );
            addMinimumReactivePowerPropertyDescriptor( object );
            addMonitorActivePowerPropertyDescriptor( object );
            addMonitorReactivePowerPropertyDescriptor( object );
            addBranchGroupTerminalPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Maximum Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_maximumActivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_maximumActivePower_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_MaximumActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Maximum Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_maximumReactivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_maximumReactivePower_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_MaximumReactivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minimum Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_minimumActivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_minimumActivePower_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_MinimumActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minimum Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_minimumReactivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_minimumReactivePower_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_MinimumReactivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Monitor Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMonitorActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_monitorActivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_monitorActivePower_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_MonitorActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Monitor Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMonitorReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_monitorReactivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_monitorReactivePower_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_MonitorReactivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Branch Group Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBranchGroupTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BranchGroup_BranchGroupTerminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BranchGroup_BranchGroupTerminal_feature",
                                "_UI_BranchGroup_type" ),
                        CimPackage.eINSTANCE.getBranchGroup_BranchGroupTerminal(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns BranchGroup.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/BranchGroup" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( BranchGroup ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_BranchGroup_type" )
                : getString( "_UI_BranchGroup_type" ) + " " + label;
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

        switch( notification.getFeatureID( BranchGroup.class ) ) {
        case CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
        case CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
        case CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
        case CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
        case CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
        case CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
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
